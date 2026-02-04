import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Student class represents a student with name and age.
 */
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student { age = " + age + ", name = '" + name + "' }";
    }
}

public class sorting {
    public static void main(String[] args) {

        // Comparator to sort Students based on age (ascending)
        // Using Lambda expression
        Comparator<Student> byAgeAsc = (s1, s2) -> Integer.compare(s1.age, s2.age);

        // You can also use Comparator.comparingInt (cleaner)
        // Comparator<Student> byAgeAsc = Comparator.comparingInt(s -> s.age);

        // OPTIONAL: Sort by age descending
        // Comparator<Student> byAgeDesc = (s1, s2) -> Integer.compare(s2.age, s1.age);

        // Creating Student list
        List<Student> students = new ArrayList<>();
        students.add(new Student(11, "Meet"));
        students.add(new Student(6, "Heet"));
        students.add(new Student(8, "Geet"));
        students.add(new Student(3, "Jeet"));
        students.add(new Student(2, "Preet"));

        // Sorting students using comparator
        Collections.sort(students, byAgeAsc);

        // Printing the sorted list
        System.out.println("Students sorted by age (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

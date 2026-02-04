// Class representing a student
class student {
    int rollnum;
    String name;
    int marks;
};

public class arr {
    public static void main(String[] args) {

        // --- Creating 3 student objects ---
        student stud1 = new student();
        stud1.marks = 93;
        stud1.rollnum = 21;
        stud1.name = "Sam";

        student stud2 = new student();
        stud2.marks = 85;
        stud2.rollnum = 22;
        stud2.name = "Tom";

        student stud3 = new student();
        stud3.marks = 78;
        stud3.rollnum = 23;
        stud3.name = "Lamie";

        // --- Storing all students in an array ---
        student studArr[] = { stud1, stud2, stud3 };

        // --- Displaying all students' info ---
        System.out.println("Student Details:");
        for (student e : studArr) {
            System.out.println(e.name + " : Roll No " + e.rollnum + " : Marks " + e.marks);
        }

        // --- Example of a 2D array (Matrix) ---
        int[][] marksMatrix = {
            {85, 90, 78},   // Marks of Sam in 3 subjects
            {88, 76, 92},   // Marks of Tom in 3 subjects
            {90, 89, 80}    // Marks of Lamie in 3 subjects
        };

        System.out.println("\n2D Array (Marks Matrix):");

        // --- Using enhanced for loop to print the 2D array ---

        // Loop to print the 2D array
        // for (int i = 0; i < marksMatrix.length; i++) {
        //     System.out.print(studArr[i].name + "'s Marks: ");
        //     for (int j = 0; j < marksMatrix[i].length; j++) {
        //         System.out.print(marksMatrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        
        int index = 0; // to track which student's marks are being printed

        for (int[] marksRow : marksMatrix) { // each row represents one student's marks
            System.out.print(studArr[index].name + "'s Marks: ");
            for (int mark : marksRow) { // each element in the row
                System.out.print(mark + " ");
            }
            System.out.println();
            index++; // move to next student
        }
    }
}

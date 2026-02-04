import java.util.HashMap;
import java.util.Map;

public class collection2map {
    public static void main(String[] args) {
        Map<String , Integer> student = new HashMap<>();

        student.put("Meet",50);
        student.put("Navi",67);
        student.put("Pragy",56);
        student.put("Heet",78);
        student.put("Rohan",78);


        System.out.println(student);
        System.out.println(student.get("Rohan"));
    }
}

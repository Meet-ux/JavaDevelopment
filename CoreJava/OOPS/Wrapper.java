public class Wrapper {
    public static void main(String[] args) {

        // 🔹 Autoboxing: primitive → object
        int a = 10;
        Integer obj = a; // autoboxing
        System.out.println("Autoboxing (int → Integer): " + obj);

        // 🔹 Unboxing: object → primitive
        Integer num = 20;
        int b = num; // unboxing
        System.out.println("Unboxing (Integer → int): " + b);

        // 🔹 Using parseInt() of Wrapper class
        String str = "123";
        int c = Integer.parseInt(str);
        System.out.println("Using parseInt(): " + c);
    }
}


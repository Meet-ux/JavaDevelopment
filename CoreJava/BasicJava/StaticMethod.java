public class StaticMethod {

    // Static method: belongs to the class, not an object
    static int add(int a, int b) {
        return a + b; // returns sum of a and b
    }

    // Another static method
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Calling static methods directly using class name is optional inside the same class
        int sum = add(10, 20); 
        System.out.println("Sum: " + sum);

        greet("Meet"); // prints greeting

        // You can also call using class name explicitly
        int sum2 = StaticMethod.add(5, 7);
        System.out.println("Sum2: " + sum2);
    }
}

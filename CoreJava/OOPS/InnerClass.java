class A2{
    int age;
    public void show(){
            System.out.println("In show");
    }
    static class B{
        public void config(){
            System.out.println(":in config");
        }
    }
}
public class InnerClass {

    public static void main(String[] args) {
        A2 obj = new A2();
        obj.show();

        A2.B obj1 =  new A2.B();
        obj1.config();
    }
}

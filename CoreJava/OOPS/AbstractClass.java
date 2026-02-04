abstract class A4{
    public abstract void show();
}
class B4 extends A4{
     public void show(){
        System.out.println("In B3 Show");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        A4 obj = new A4(){
            public void show(){
                System.out.println("In anonymous class Show");
            }
        };
        obj.show();
    }
}


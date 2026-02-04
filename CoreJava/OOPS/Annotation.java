class A5{
    public void showTheData(){
        System.out.println("In A5 Show");
    }
}
class B5 extends A5{
    @Override
    public void showTheData(){
        System.out.println("In B5 Show");
    }
}
public class Annotation {
    public static void main(String[] args) {
        B5 obj = new B5();
        obj.showTheData();
    }
}

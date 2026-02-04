class A3{
    public void show(){
        System.out.println("In A3 Show");
    }
}
// class B3 extends A3{
//      public void show(){
//         System.out.println("In B3 Show");
//     }
// }
public class Anonymous {
    public static void main(String[] args) {
        A3 obj = new A3()
        {
            public void show(){
                System.out.println("In B3 Show");
            }
        };
        obj.show();
    }
}

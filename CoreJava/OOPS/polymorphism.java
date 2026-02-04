// package CoreJava.OOPS;
class computer{

}
class laptop extends computer {

}
class A{
        public void show(){
            System.out.println("In A show");
        }
}
class B extends A{
        public void show(){
            System.out.println("In B show");
        }
}
class C extends A{
        public void show(){
            System.out.println("In C show");
        }
}
public class polymorphism {
        public static void main(String[] args) {
            A obj = new A();
            obj.show();
            obj = new B();
            obj.show();
            obj = new C();
            obj.show();
            //computer obj1 = new laptop();
        }
}
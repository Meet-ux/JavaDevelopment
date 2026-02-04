//Class to Class = Extends
//Interface to Interface = Extends
//Interface to class = Implements
interface A4{
    int age = 44;
    String area = "Mumbai";
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X {
    
}

class B4 implements A4,X{
    public void show(){
        System.out.println("Showing in B4");
    }
    public void config(){
        System.out.println("Config in B4");
    }
    public void run(){
        System.out.println("Run in B4");
    }
    
}


public class Interface2{
    public static void main(String[] args) {
        A4 obj = new B4();
        obj.config();
        obj.show();
        B4 obj1 = new B4();
        obj1.run();
        System.out.println(B4.age);
        System.out.println(B4.area);
    }
}
class A1{
    public void show(){
        System.out.println("Show methood of A");
    }
}

class B1 extends A1{
    public void show2(){
        System.out.println("Show methood of B");
    }
}

public class typeCasting {
    public static void main(String[] args) {
        //A1 obj = (A)new  B1();Upcasting OBJ OF B casted to A "Object Of B refer to A"
        A1 obj = new  B1();// 
        obj.show();
        B1 obj1 = (B1) obj;//Downcasting the A's object is casted to its child class so it is downcasting 

        obj1.show2();
    }
}

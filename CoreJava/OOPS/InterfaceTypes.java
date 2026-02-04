
@FunctionalInterface
interface A6{
    int  add(int i , int j);
}

public class InterfaceTypes {
    public static void main(String[] args) {
        A6 obj = ( a, b ) -> {return a+b;};
        
        System.out.println(obj.add(5,7));
    }
}

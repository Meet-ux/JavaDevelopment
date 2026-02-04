sealed class A permits B7,C7{

}

sealed class B7 extends A permits D{
    
}
non-sealed class C7 extends A{

}

final class D extends B7{

}
sealed interface C9 permits D9{

}

non-sealed interface D9 extends C9{

}
public class SealedClass {
    public static void main(String[] args) {
        System.out.println("GHello");
    }
}

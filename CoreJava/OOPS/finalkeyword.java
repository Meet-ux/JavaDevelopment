//Final = Variable , Methood , Class

class calc{
        final public void show(){
            System.out.println("Calculator's Show");
        }
        public void add(int a , int b ){
            System.out.println(a+b);
        }
}
// class AdvCalc extends calc{ Not possible to extend the final class 

// }

class AdvCalc extends calc {
    // public void show(){ Not possible to overide the final methood
    //     System.out.println("Show of AdvCalc");
    // }
}

public class finalkeyword {
    public static void main(String[] args) {
        final int num = 9;
        //num = 10;
        System.out.println(num);
    }
}

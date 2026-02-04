abstract class car{
    public void playMusic(){
        System.out.println("Playing Music the Car");
    }
    public abstract void Drive();
    public abstract void Dancing();
}

abstract class Wagonr extends car {
    public void Drive(){
        System.out.println("Driving the WagonR");
    }
    
}

class NewWagonr extends Wagonr{//Concrete class
    public void Dancing(){
        System.out.println("Dancing in   the WagonR");
    }
}

public class Abstract {
    public static void main(String args[]){
            //car obj1 = new car(); Cannot make object of abstract class 
            car obj1 = new NewWagonr();//We can take refrence of abstract class
            obj1.playMusic();
            obj1.Drive();
            obj1.Dancing();
    }
}

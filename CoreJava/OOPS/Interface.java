interface computer{
     void code();
}
class laptop implements computer{
    public void code(){
        System.out.println(" Coding in laptop");
    }
}
class Desktop implements computer{
    public void code(){
        System.out.println(" Coding in Desktop");
    }
}
class Developer{
    public void developApp(computer obj){
        obj.code();
    }
}


public class Interface {
    public static void main(String[] args) {
        
            computer lap = new laptop();
            computer desk = new Desktop();
        
        Developer navin = new Developer();
        navin.developApp(lap);
        navin.developApp(desk);
    }
}

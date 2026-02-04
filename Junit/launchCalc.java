//package Junit;

public class launchCalc {
    public static void main(String[] args) {
        Calc c = new Calc();

        int result = c.divide(10, 5);
        if(result==2){
            System.out.println("Testcase Passed");
        }
        else{
            System.out.println("TestCase Failed");
        }
        int result2 = c.divide(2, 5);
        if(result2==2){
            System.out.println("Testcase Passed");
        }
        else{
            System.out.println("TestCase Failed");
        }
    }
};

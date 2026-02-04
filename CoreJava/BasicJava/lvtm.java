//Local variable type inference

import java.util.ArrayList;

public class lvtm {
    //var num =19; var cannot be used here
    public static void main(String[] args) {
        System.out.println();
        ArrayList obj = new ArrayList<>();

        int a = 9;
        var b = 10; //We can define without mentionting datatype
        String var = "Hello";//Var is not reserved keyword for intialize variable Cannot create the class name var
        int c ;
        var d = 10;

        int nums[] = new int[10];
        var nums2 = new int[10];

    }
}

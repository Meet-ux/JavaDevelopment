import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class io {
    public static void main(String[] args)throws IOException{
            //System.out.println("Enter the number");
            //int num = System.in.read();//This will ascii value of the read. This only read first char at a time instad of 54 it reads only 5
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);

            Scanner sc = new Scanner(System.in);
            int num2 = sc.nextInt();
            System.out.println(num2);

            try{
                int num = Integer.parseInt(bf.readLine());
                System.out.println(num);
            }
            catch(Exception e){
                System.out.println("Please Enter valid numbr");

            }
    };
}

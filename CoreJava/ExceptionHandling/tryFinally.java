import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tryFinally {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            // InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader bf = new BufferedReader(in);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println();
        }
        finally{
            //bf.close();
        }
    }
}

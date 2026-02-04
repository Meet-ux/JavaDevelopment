//package  CoreJava.ExceptionHandling;
public class exception{
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        int[] num = new int[5];
        try{
            j = j/i;
            if(j==0){
                throw new ArithmeticException();
            }
            System.out.println("Finally Ran SUCCESFULLY ");
            System.out.println(num[4]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Its arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is out of bound exception");
        }
        catch(Exception e){
            System.out.println("Something is wrong ");
        }
        System.out.println(j);
    }
}
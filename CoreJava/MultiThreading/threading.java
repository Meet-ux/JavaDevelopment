//package CoreJava.MultiThreading;

// class A implements Runnable{//Extends Thread is not good practice insteadu use implenment Runnable 
//     public void run(){
//         for(int i = 0; i<=100;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
class B extends Thread{
    public void run(){
        for(int i = 0; i<=100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class threading {
    public static void main(String[] args) {
        Runnable obj = () -> {
            for (int i = 0; i <= 100; i++) {
                System.out.println("Hello");
                try {Thread.sleep(10);} catch (Exception e) {e.printStackTrace();}
            }
        };
        
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}

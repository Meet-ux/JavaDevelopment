class Counter{
    int count ;
    public synchronized void increment(){
        count++;
    };
}
public class threading2 {
    public static void main(String[] args) throws InterruptedException {
        Counter C = new Counter();
        Runnable obj = () -> {
            for (int i = 0; i <= 10000; i++) {
                C.increment();
            }
        };
        
        Runnable obj2 = () -> {
            for (int i = 0; i <= 10000; i++) {
                C.increment();
            };
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        // t1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(C.count);
    }       
}

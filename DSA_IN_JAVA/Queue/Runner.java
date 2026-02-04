//package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.enQueue(6);
        obj.enQueue(3);
        obj.enQueue(2);
        obj.enQueue(1);
        obj.show();
        obj.deQueue();
        System.out.println();
        obj.show();
        System.out.println();
        System.out.println(obj.getSize());
        obj.getSize();
        System.out.println(obj.isEmpty());
        System.out.println(obj.isFull());
    }
}  
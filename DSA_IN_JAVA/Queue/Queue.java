//package Queue;

public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
            queue[rear] = data;
            rear  = rear + 1;
            size = size + 1;

    }

    public void deQueue(){
            int data = queue[front];
            front = front + 1 ;
            size = size -1 ;
    }


    public void show(){
        System.out.print("Elements :- ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[front+i]+" ");
        }
        System.out.println();
        for (int i : queue) {
            System.out.print(i+" ");
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if (size==0) {
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (size==5) {
            return true;
        }
        return false;
    }


}
 
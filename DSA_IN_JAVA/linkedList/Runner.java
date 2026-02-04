//package linkedList;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.add(3,5);
        // list.add(4,2);
        // list.add(1,4);
        // list.add(2,1);
        // list.add(0,6);

        LinkedListM list = new LinkedListM();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insertAtStart(25);
        list.insert(1);
        list.insertAtAnyLocation(2,55);
        list.insertAtAnyLocation(0,85);
        list.show();
        System.out.println();
        System.out.println();
        list.delete(1);
        
        list.show();
        
    }
}

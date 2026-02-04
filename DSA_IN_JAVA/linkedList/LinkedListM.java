//package linkedList;

public class LinkedListM {
    
    Node head;
    void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while (n.next!=null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    void insertAtAnyLocation(int index, int data)//index  = 2;
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index==0) {
            insertAtStart(data);
            return;
        }

        Node n = head;
        for (int i = 0; i < index-1; i++) {
            n = n.next;//Current stopped on 1
        }
        node.next = n.next;//Address 1 storing will goes to 2  1--->3  = 2--->3 so know two will know point towards three
        n.next = node;//Address of 2 will stored in 1 So        1--->2--->3 know one will point towards two and two will towards three
    }

    void delete(int index ){
        Node n = head;
        Node n1 = null;

        if (index==0) {
            head = head.next;
        }
        else{
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            n1 = n.next;// The n.next pins towards next element of current n;
            n.next = n1.next;
            //System.out.println(" n1 "+ n1);
            n1 = null;
        }
    }
    void show(){
        
        Node node = head;
        while (node.next!=null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

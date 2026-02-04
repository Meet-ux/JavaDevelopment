class Node{
    int data;
    Node next;
}
class LinkedListM{
    Node head;
    public void insert(int data){
        Node obj = new Node();
        obj.data = data;
        obj.next = null;
        if (head==null) {
            head = obj;
        }
        else{
            Node n = head;
            while (n.next!=null) {
                n = n.next;
            }
            n.next = obj;
        }
    }
    public void show(){
        Node tempP = head;
        while (tempP != null) {
            System.out.println(tempP.data);
            tempP = tempP.next;
        }
    }
}


public class Zpractice {
    
    public static void main(String[] args) {
        LinkedListM list = new LinkedListM();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.show();
    }
}

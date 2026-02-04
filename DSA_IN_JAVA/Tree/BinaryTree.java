//package Tree;

class Node{
    int data;
    int left;
    int right;

    public Node(int data){
        this.data = data; 
    }
}

public class BinaryTree {

    public void insert(int data ){
        // if (root==null) {
            //     root = new Node(data);
            // }
            // else if (data<root.data) {
        //     root.left.data = data;
        // }
        root = insertRec(root, data);
    }
    
    Node root;
    public Node insertRec(Node root , int data){
        if (root==null) {
            root = new Node(data);
        }
        else if (data<root.data) {
            root.left = insertRec(root.left, data);
        }
        else if (data>root.data) {
            root.right  = insertRec(root.right, data);
        }
        return root;
    }
}

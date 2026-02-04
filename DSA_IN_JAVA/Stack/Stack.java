//package Stack;

public class Stack {
    int[] arr = new int[5];
    int top = 0;
    public void push(int data){
        arr[top]  = data;
        top++; 
    }
    public int pop(){
        top--;
        int data;
        data  = arr[top] ;
        arr[top]= 0;
        return data;
    }
    public int peek(){
        
        int data;
        data  = arr[top-1] ;
        
        return data;

    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        if (top==0) {
            return true;
        }
        return false;
    }
    public boolean isFull(){
         
        if (top==5) {
            return true;
        }
        return false;
    }
    public void show(){
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }

}

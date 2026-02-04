//package DynamicArrayStack;

public class Stack {
    int capacity = 2;
    int[] arr = new int[capacity];
    int top = 0;


    public void push(int data){
        if(size()==capacity){
            expand();
        }
        arr[top]  = data;
        top++; 
    }

    public void expand(){
        int length = size();
        int newStack[] = new int [capacity*2];
        System.arraycopy(arr,0,newStack,0,length);
        arr = newStack;
        capacity = capacity*2;
    }



    public int pop(){
        int data = 0;
        if (top == 0) {
            System.out.println("Stack is empty");
        }
        else{
            top--;
            data = arr[top] ;
            arr[top]= 0;
            shrink(); 
        }
        return data;
    }

    public void shrink(){
        int length = size();
        if(length<=(capacity/2)/2){
            capacity = capacity/2;
        }
        int newStack[] = new int [capacity];
        System.arraycopy(arr,0,newStack,0,length);
        arr = newStack;
        
        
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
        System.out.println();
    }

}

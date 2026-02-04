//public package Stack;
class Runner {
    public static void main(String[] args) {
        Stack obj  = new Stack();
        obj.push(12);
        obj.push(13);
        obj.push(14);
        obj.push(15);
        obj.push(16);
        //System.out.println(obj.pop());;
        System.out.println(obj.peek());
        System.out.println("Size is : "+obj.size());
        System.out.println(obj.isFull());
        System.out.println(obj.isEmpty());
        obj.show();
    }
}
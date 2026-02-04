class laptop{
    String  model;
    int price;
    public String toString(){
        return model + ":"+ price ;
    }
    public boolean equals(laptop that){
        if(this.model.equals(that.model)&&this.price==that.price){
            return true;
        }
        else {
            return false;
        }
    }
}

public class objectclass {

    public static void main(String[] args){
        laptop obj = new laptop();
        obj.model = "Victus";
        obj.price = 50000;

        laptop obj2 = new laptop();
        obj2.model = "Victus";
        obj2.price = 50000;
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj2));
    }
}

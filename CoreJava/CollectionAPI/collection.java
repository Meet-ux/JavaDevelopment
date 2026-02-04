package COREJAVA.CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(3);

        for(Object n : nums){
            int num = (Integer)n;
            System.out.println(num);
        }
    }
}
//List Supports the indexing 
//Set does not allow duplicate elements and does not support index value
//TreeSet gives Sorted Format 
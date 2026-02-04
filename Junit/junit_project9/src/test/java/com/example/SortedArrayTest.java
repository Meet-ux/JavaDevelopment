package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class SortedArrayTest {

    SortedArray obj = new SortedArray();
    @Test
    public void sortTest() {

        int[] arr = {2, 4, 5, 6, 1, 4, 3};
        int[] expected = {1, 2, 3, 4, 4, 5, 6};

        obj.SortArr(arr);   // ya jo bhi method ka exact naam hai
        assertArrayEquals(expected, arr);
    }
    @Test
    public void sortTest_Exception() {

        try {
        int[] unsorted = null;
         
        int[] sorted = obj.SortArr(unsorted);  // ya jo bhi method ka exact naam hai
        
        System.out.println("Exception not occured of pointer");
        fail();
        } 
        catch (NullPointerException e) {
            System.out.println("Exception occured of null pointer");
        }
    }
    @Test
    public void sortTestLambda() {

        int[] arr = null;
        
        assertThrows(NullPointerException.class, ()->obj.SortArr(arr));
       
    }
    @Test
    public void sortTest_Time() {

        int[] unsorted ={22,41,13};
         
        obj.SortArr(unsorted);  // ya jo bhi method ka exact naam hai
        
        
        
        assertTimeout(Duration.ofMillis(10),()->obj.SortArr(unsorted));
        
    

    }
}

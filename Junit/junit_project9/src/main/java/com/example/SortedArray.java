package com.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class SortedArray {
    public int[] SortArr(int[] Arr){
        for(int i = 0; i<100000 ; i++){
            Arrays.sort(Arr);
        }
        return Arr;
    }
    
}

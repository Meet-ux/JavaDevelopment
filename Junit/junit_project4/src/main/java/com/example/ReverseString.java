package com.example;
public class ReverseString {
    static String reverse(String str){
         char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);
        return reversed; // Output: olleh
    }
    public static void main(String[] args) {
        String str = "hello";
        reverse(str);
    }
}

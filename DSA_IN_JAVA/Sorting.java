public class Sorting {

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume current index holds the minimum

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if smaller is found
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println("After selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int j = i;
            while (j>0&&arr[j-1]>arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 7, 8, 2, 5, 3, 9, 1 };

        System.out.println("Before Sorting");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        insertionSort(nums);

        System.out.println();
        System.out.println("After Sorting");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}

public class searching {

    // ------------------ LINEAR SEARCH ------------------
    // Checks each element one-by-one
    public static int LinSearch(int[] nums, int target) {

        int steps = 0;  // counts how many checks we do

        for (int i = 0; i < nums.length; i++) {
            steps++;  // step taken

            // If element found
            if (target == nums[i]) {
                System.out.println("Total steps in LinearSearch: " + steps);
                return i;
            }
        }

        // If element not found
        System.out.println("Total steps taken in LinearSearch: " + steps);
        return -1;
    }

    // ------------------ BINARY SEARCH (Recursive) ------------------
    /*
        Binary Search reduces the search space by half every time.
        'count' tracks how many steps we take during recursion.
    */
    public static int BinSearch(int[] nums, int target, int left, int right, int count) {

        // Only search while left <= right
        if (left <= right) {

            count++; // We took one step in search

            int mid = (left + right) / 2;  // Middle index

            // Case 1: Element found
            if (nums[mid] == target) {
                System.out.println("Total steps in BinarySearch: " + count);
                return mid;
            }

            // Case 2: Search right half
            else if (nums[mid] < target) {
                return BinSearch(nums, target, mid + 1, right, count);
            }

            // Case 3: Search left half
            else {
                return BinSearch(nums, target, left, mid - 1, count);
            }
        }

        // If element NOT found
        System.out.println("Total steps in BinarySearch: " + count);
        return -1;
    }

    // ------------------ MAIN METHOD ------------------
    public static void main(String[] args) {

        int[] nums = new int[1000];  
        int target = 22;

        // Binary Search
        int result = BinSearch(nums, target, 0, nums.length - 1, 0);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found using BinarySearch");
        }

        // Linear Search
        int result1 = LinSearch(nums, target);
        if (result1 != -1) {
            System.out.println("Element found at index " + result1);
        } else {
            System.out.println("Element not found using LinearSearch");
        }
    }
}

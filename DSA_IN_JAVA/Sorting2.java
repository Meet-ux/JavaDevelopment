import java.util.ArrayList;

public class Sorting2 {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArray(arr, low, high);
    }

    private static void mergeArray(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>(high - low + 1); // pre-size

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }
        while (left <= mid) temp.add(arr[left++]);
        while (right <= high) temp.add(arr[right++]);

        // copy merged values back into original array
        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 2, 5, 3, 9, 1};
        mergeSort(arr, 0, arr.length - 1);
        // print sorted array
        for (int v : arr) System.out.print(v + " ");
    }
}

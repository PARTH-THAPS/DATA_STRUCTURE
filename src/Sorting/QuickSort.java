package Sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partitioning index
            quickSort(arr, low, pi - 1);  // Recursively sort the left part
            quickSort(arr, pi + 1, high); // Recursively sort the right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing the rightmost element as the pivot
        int i = low - 1;  // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at i + 1 so that the pivot is in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print array elements with a space
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1); // Call quickSort on the entire array
        printArray(arr); // Print the sorted array
    }
}

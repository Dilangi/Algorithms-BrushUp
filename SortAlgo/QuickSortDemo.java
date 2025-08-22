package SortAlgo;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println();

        quickSort(array);

        System.out.println("Sorted array: ");
        for (int num : array) System.out.print(num + " ");
    }

    // Public method to sort an array
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // No need to sort
        }
        quickSort(arr, 0, arr.length - 1);
    }

    // Recursive quick sort method
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array
            quickSort(arr, low, pivotIndex - 1);        // Sort left subarray
            quickSort(arr, pivotIndex + 1, high);       // Sort right subarray
        }
    }

    // Partition method using Lomuto partition scheme
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;       // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // Place pivot in correct position
        return i + 1;            // Return pivot index
    }

    // Utility method to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

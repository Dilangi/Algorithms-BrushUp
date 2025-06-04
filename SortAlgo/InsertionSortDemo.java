package SortAlgo;

public class InsertionSortDemo {

    //assume first elemnt already sorted. so startig from index 1
    // consider array into two parts; sorted and unsorted

    public static void insertionSort(int[] arr) {
        int size = arr.length;

        // Start from the second element
        for (int i = 1; i < size; i++) {
            int key = arr[i];      // Element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are > key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct sorted position
            arr[j + 1] = key;
        }
    }
}

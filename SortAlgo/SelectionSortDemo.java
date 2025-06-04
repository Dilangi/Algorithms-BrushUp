package SortAlgo;

public class SelectionSortDemo {
    //Time complexity O(n^2)
    public static void selectionSortAscending(int[] arr) {
        int size = arr.length;

        // Move the boundary of the unsorted subarray
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum with the first element of the unsorted part
            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }
}

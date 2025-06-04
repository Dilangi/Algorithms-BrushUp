package SortAlgo;

public class BubbleSortDemo {
    //simple but not efficient, o(n^2)

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;

        //for all passes
        for (int i = 0; i < size - 1; i++) {
//            swapped = false;

            //comparisons in this pass
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    swapped = true;
                }
            }

            // If no swaps occurred, array is already sorted
//            if (!swapped) {
//                break;
//            }
        }
    }
}

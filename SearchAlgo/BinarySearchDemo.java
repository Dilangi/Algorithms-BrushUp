package SearchAlgo;

public class BinarySearchDemo {
    /** Time complexity: O(log n)
     *  effective for: large sorted dataset
     */


    // technique is halving the array (when finding mid: (l + ((r-l) /2)) is better than (left + right/2) and avoid integer overflow)
    // avoid overflow mean:  if left and right are very large integers, their sum could exceed the maximum value that an int can hold in Java

    /*better to use iterative approach rather recursion approach in terms of
     performace: recursion is slightly slower as it uses call stack
     memory use: O(1) |||||| O(log n)
     Risk: no stackOverFlow |||||| has risk if recursion depth is large

     */
    public static int binarySearch(int[] arr, int target){
        int left =0;
        int right = arr.length-1;

        while (left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binarySearchRecursion(arr, mid + 1, right, target);
        return binarySearchRecursion(arr, left, mid - 1, target);
    }
}

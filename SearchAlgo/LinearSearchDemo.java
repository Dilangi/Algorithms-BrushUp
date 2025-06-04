package SearchAlgo;

public class LinearSearchDemo {
    // complexity: O(n)
    public static int linearSearchUsingValue(int[] arr, int target){
        int index = 0;
        for(int value: arr){
            if(value==target) return index;
            index++;
        }
        return -1;
    }

    public static int linearSearchByIndex(int[] arr, int target){
        for(int index=0; index<arr.length; index++){
           if(arr[index]==target) {
               return index;
           }
        }
        return -1;
    }
}

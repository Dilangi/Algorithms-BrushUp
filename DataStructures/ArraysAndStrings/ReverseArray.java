package DataStructures.ArraysAndStrings;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {3,5,2,6,1,8,7};
        System.out.println("The reversed array is "+ Arrays.toString(reversedArray(arr)));
    }

    private static int[] reversedArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return arr;
    }
}

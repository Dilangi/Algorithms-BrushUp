package Practice;

import java.lang.reflect.Array;

public class SlidingWindow {
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("The maximum sum is "+ slidingWindow(arr, k));
    }

    public static int slidingWindow(int[] arr, int k){

        int max =0, sum =0, start =0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];

            if(i >= k-1){
                max = Math.max(sum, max);
                sum -= arr[start];
                start++;
            }
        }
        return max;
    }

}

package DataStructures.ArraysAndStrings;

public class MaxElementInArray {
    public static void main(String[] args){
        int[] arr = {3,5,2,6,1,8,7};
        System.out.println("The maximum number of the array is "+ getMax(arr));
    }

    private static int getMax(int[] arr){
        int result =arr[0];
        for(int i: arr) result = Math.min(result, i);
        return result;
    }
}

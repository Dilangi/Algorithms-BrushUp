package DataStructures.ArraysAndStrings;

public class MinElementInArray {
    public static void main(String[] args){
        int[] arr = {3,5,2,6,1,8,7};
        System.out.println("The minimum number of the array is "+ getMin(arr));
    }

    private static int getMin(int[] arr) {
        int result = arr[0];
        for(int i: arr) result = Math.min(result,i);
        return result;
    }
}

package DataStructures.ArraysAndStrings;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,5,0,6,6,0,8,0};
        zerosInTheEnd(arr);
    }

    private static void zerosInTheEnd(int[] arr) {
//        int size  = arr.length;
//        int pointer = size-1;
//        for(int i=size-1; i>=0; i--){
//            if(arr[i]!=0){
//                pointer = Math.max(i, pointer);
//            }
//            else{
//                arr[i]=arr[pointer];
//                arr[pointer]=0;
//                pointer -= 1;
//            }
//        }

        int nextNonZeroPosition  = 0;
        //moves all non-zero numbers to the front of the array nums, keeping their original order
        for (int num : arr) {
            if (num != 0) arr[nextNonZeroPosition ++] = num;
        }
        //fill the rest of the array with zeros
        while (nextNonZeroPosition  < arr.length) arr[nextNonZeroPosition ++] = 0;

        for(int i: arr){
            System.out.println(i);
        }
    }
}

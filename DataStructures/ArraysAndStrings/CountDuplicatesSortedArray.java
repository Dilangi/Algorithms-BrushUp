package DataStructures.ArraysAndStrings;

public class CountDuplicatesSortedArray {
    public static void main(String[] args){
    int[] arr = {1,2,3,5,6,6,6,8,8,9};
    System.out.println("Sorted distinct array size is "+ removeDuplicates(arr));
}

    private static int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;

        int duplicateCount =0;
        for(int currentIndex =0; currentIndex<arr.length-1; currentIndex++){
            if(arr[currentIndex] == arr[currentIndex+1]){
                duplicateCount++;
            }
        }
        return arr.length-duplicateCount;
    }
}

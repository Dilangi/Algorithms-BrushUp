package DataStructures.ArraysAndStrings;

public class CountDuplicatesSortedArray {
    public static void main(String[] args){
    int[] arr = {1,2,3,5,6,6,7,8};
    System.out.println("Sorted distinct array size is "+ removeDuplicates(arr));
}

    private static int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;

        int lastUniqueIndex =0;
        for(int currentIndex =1; currentIndex<arr.length; currentIndex++){
            if(arr[currentIndex] != arr[lastUniqueIndex]){
                arr[++lastUniqueIndex] = arr[currentIndex];
            }
        }
        return lastUniqueIndex+1;
    }
}

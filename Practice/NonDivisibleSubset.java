package Practice;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args){

        List<Integer> dataSet = Arrays.asList(1,7, 2, 8, 4, 11, 5);
        System.out.println(nonDivisibleSubset(3, dataSet));
    }

    private static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remainderCounts = new int[k];
        for (int num : s) {
            remainderCounts[num % k]++;
        }

        int result = 0;
        // Handle remainder 0 case
        if (remainderCounts[0] > 0) {
            result += 1;
        }

        // Handle even k case for remainder k/2
        if (k % 2 == 0) {
            if (remainderCounts[k / 2] > 0) {
                result += 1;
            }
        }

        // For other remainders, take the max between i and k-i
        for (int i = 1; i < (k + 1) / 2; i++) {
            if (i != k - i) {
                result += Math.max(remainderCounts[i], remainderCounts[k - i]);
            }
        }

        return result;
    }
}

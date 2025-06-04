package Practice;

/**
 * We define a magic square to be an n x n  matrix of distinct positive integers from 1 to nxn where
 * the sum of any row, column, or diagonal of length  is always equal to the same number: the magic constant.
 * You will be given a 3x3 matrix  of integers in the inclusive range [1,9]. We can convert any digit a to any other digit b in the range [1,9]  at cost of abs(a-b).
 * Given , convert it into a magic square at minimal cost. Print this cost on a new line.
 * Note: The resulting magic square must contain distinct integers in the inclusive range [1,9].
 */
public class MagicSquare {
    public static void main(String[] args){
        int[][] s = {
                {4, 8, 6},
                {3, 1, 5},
                {7, 9, 2}
        };

        System.out.println(solution(s));
    }

    public static int solution(int[][] sample){
        int[][][] possibilities = {
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}
        };

        int minCost = Integer.MAX_VALUE;

        // Compare each magic square
        for (int[][] possibility : possibilities) {
            int cost = 0;
            int i = 0;
            while(i < 3) {
                for (int j = 0; j < 3; j++) {
                    cost += Math.abs(sample[i][j] - possibility[i][j]);
                }
                i++;
            }
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}



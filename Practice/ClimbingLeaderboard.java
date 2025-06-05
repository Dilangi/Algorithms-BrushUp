package Practice;

import java.util.*;

/**
 * You have a leaderboard with scores sorted in descending order, where players with the same score share the same rank (Dense Ranking).
 * Given the leaderboard scores and a list of a player’s scores, determine the player’s rank after each new score.
 * Example:
 * Leaderboard scores: [100, 90, 90, 80]
 * Player scores: [70, 80, 105]
 * Ranks after each player score: [4, 3, 1]
 * Explanation:
 * Score 70 is below all leaderboard scores → rank 4
 * Score 80 ties with 80 on the leaderboard → rank 3
 * Score 105 beats the top score → rank 1*/

public class ClimbingLeaderboard {
    public static void main(String[] args){
        List<Integer> ranked = Arrays.asList(100, 100, 50, 50, 40, 20, 10);
        List<Integer> player = Arrays.asList(5, 25, 50, 120);

        System.out.println(climbingLeaderboard(ranked, player));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> newRanking = new ArrayList<>();

        Set<Integer> distinctSet = new TreeSet<>(Collections.reverseOrder());
        distinctSet.addAll(ranked);
        List<Integer> distinctRanks = new ArrayList<>(distinctSet);

        int n = distinctRanks.size();
        for (int score : player) {
            int low = 0, high = n - 1, rankIndex = n;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (score >= distinctRanks.get(mid)) {
                    rankIndex = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // Rank = index + 1
            newRanking.add(rankIndex + 1);
        }

        return newRanking;
    }
}

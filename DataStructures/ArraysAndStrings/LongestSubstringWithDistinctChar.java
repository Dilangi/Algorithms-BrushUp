package DataStructures.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithDistinctChar {
    public static void main(String[] args) {
        String str = "dilangiili";
        System.out.println("The length of the longest substring with distinct characters is: " + lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {
        int result = 0;
        int left = 0;
        Set<Character> charSet = new HashSet<>();
        for(int curr=0; curr<str.length(); curr++) {
            char currChar = str.charAt(curr);
            while(charSet.contains(currChar)){
                charSet.remove(str.charAt(left));
                left++;
            }

            charSet.add(currChar);
            result = Math.max(result, curr - left + 1);
        }
        return result;
    }
}

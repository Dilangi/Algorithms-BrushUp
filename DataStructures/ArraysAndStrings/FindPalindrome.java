package DataStructures.ArraysAndStrings;

public class FindPalindrome {public static void main(String[] args){
    String str = "Dilalid";
    System.out.println(str + reversedString(str));
}

    private static String reversedString(String str) {
        int left = 0, right = str.length()-1;
        String result = " is a palindrome.";
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)) return " is not a palindrome.";
        }
        return result;
    }
}

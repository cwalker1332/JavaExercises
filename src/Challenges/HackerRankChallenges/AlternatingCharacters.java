package Challenges.HackerRankChallenges;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    public static int alternatingCharacters(String s) {
        // initialize number of deletions
        int count = 0;

        // for loop to run through string
        for (int i = 1; i <= (s.length() - 1); i++) {
            // compare char at index 1 with char at index 0 and so on
            if (s.charAt(i - 1) == s.charAt(i)) {
                // increase number of deletions if char match
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // initialize string to test
        String result = "aabbaa";

        // call on alternatingCharacters method and print. Should return 3
        System.out.println(alternatingCharacters(result));
    }
}

// Alternate solution, still haven't gotten it to work though
/*
        int count = 0;
        char[] chars = s.toCharArray();
        char temp = chars[0];

        // start from one so you don't have to do chars[i+1] on line 19
        for (int i = 1; i <= chars.length; i++) {
            if (temp == chars[i]) {
                count++;
            } else {
                temp = chars[i];
            }
        }
        return count;
*/
package DSAPractice.Strings;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        // test random string; should return 3
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s){
        // initialize start and end of substring and maxLength
        int startOfSub = 0;
        int endOfSub = 0;
        int maxLength = 0;

        // create empty hashset
        // using hashset because it contains only unique values thus avoiding duplicates
        HashSet<Character> set = new HashSet<>();

        // run through string making sure we don't go past the end of our substring
        while(endOfSub < s.length()){
            // if the char at the end of the string is not in the hashset yet, add it
            if (!set.contains(s.charAt(endOfSub))){
                set.add(s.charAt(endOfSub));
                endOfSub++;
                // set maxLength equal to whichever is the largest (either set size or maxLength)
                // Math.max returns the largest out of the two objects
                // Math.min will return the smallest -- just a mental note
                maxLength = Math.max(set.size(), maxLength);
            } else {
                // if char is in set, remove char at start of our substring
                set.remove(s.charAt(startOfSub));
                startOfSub++;
            }
        }

        return maxLength;
    }
}

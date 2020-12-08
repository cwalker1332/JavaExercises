package DSAPractice.Arrays;

    /*
        Exercise: Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".

        Assumptions: strings[i] consists of only lower case English letters.
     */

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strings){
        // create empty StringBuilder to add common letters to
        StringBuilder commonPrefix = new StringBuilder();

        // create for loop to access each string in array
        for (int i = 0; i < strings.length - 2; i++) {
            // loop through each letter in string
            for (int j = 0; j < strings[i].length(); j++) {
                // if chars match, add to StringBuilder
                if (strings[i].charAt(j) == strings[i+1].charAt(j)){
                    commonPrefix.append(strings[i].charAt(j));
                } else {
                    return commonPrefix.toString();
                }
                // ensure that i does not exceed the number of strings in array to avoid OutOfBounds Exception
                while (i < strings.length - 2) {
                    i++;
                }
            }
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] str2 = {"dog","racecar","car"};
        String[] str3 = {"court","count","coup"};

        // should return "fl"
        System.out.println(longestCommonPrefix(strs));

        // should return empty string
        System.out.println(longestCommonPrefix(str2));

        // should return "cou"
        System.out.println(longestCommonPrefix(str3));
    }
}
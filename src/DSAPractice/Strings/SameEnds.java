package DSAPractice.Strings;

    /*
    Exercise: Given a string, return the longest substring that appears at both the beginning and end of
    the string without overlapping. For example, sameEnds("abXab") is "ab".
                sameEnds("abXYab") → "ab"
                sameEnds("xx") → "x"
                sameEnds("xxx") → "x"
    */

public class SameEnds {

    public static String sameEnds(String string) {
        // create empty string
        String longest = "";

        // initialize middle of string
        int midPoint = string.length() / 2;

        for (int i = 0; i < midPoint + 1; i++) {
            // create substrings to split string in half so that the first half of the string is the start
            // and the other half is the end
            String start = string.substring(0, i);
            String end = string.substring(string.length() - i);

            // if both halves of the string are equal, the longest substring possible is either half
            // therefore longest could be equal to start or end; here I just chose start
            if (start.equals(end)) {
                longest = start;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        // call on method using string you want
        // should return ab
        System.out.println(sameEnds("abXYab"));
    }
}

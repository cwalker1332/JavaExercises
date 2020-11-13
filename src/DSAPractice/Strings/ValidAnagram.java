package DSAPractice.Strings;

    // Exercise: Given two strings s and t, write a function to determine if t is an anagram of s.

public class ValidAnagram {

    public static boolean isAnagram(String s, String t){
        //Removing white spaces from s and t and converting case to lower
        String s2 = s.replaceAll("s", "").toLowerCase();
        String t2 = t.replaceAll("s", "").toLowerCase();

        // if s2 and t2 don't have same length return false
        if (s2.length() != t2.length()){
            return false;
        } else {
            // converting s2 to char array
            char[] s2Array = s2.toCharArray();

            // create StringBuilder using t2
            StringBuilder sb = new StringBuilder(t2);

            // check whether each character of s2Array is present in sb
            for (char c : s2Array){
                int index = sb.indexOf(""+c);

                // if present, remove that character from sb
                if (index != -1) {
                    sb = sb.deleteCharAt(index);

                // if not present, return false
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "Listen"));
        System.out.println(isAnagram("dab","bad"));
        System.out.println(isAnagram("who","how"));
        System.out.println(isAnagram("no","yes"));
        System.out.println(isAnagram("cat","dog"));
    }
}

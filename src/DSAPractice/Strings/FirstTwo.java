package DSAPractice.Strings;

    /*
    Exercise: Given a string, return the string made of its first two chars, so the String
    "Hello" yields "He". If the string is shorter than length 2, return whatever there is
    so "X" yields "X" and the empty string "" yields "".
     */

public class FirstTwo {

    public static String firstTwo (String str) {
        // if less string length is less than 2, return the original string
        if (str.length() < 2){
            return str;

        // if string is greater than or equal to 2, return first two chars only
        } else {
            return str.substring(0,2);
        }
    }

    public static void main(String[] args) {
        // call method using string you want
        System.out.println(firstTwo("hello"));
        System.out.println(firstTwo("x"));
    }
}

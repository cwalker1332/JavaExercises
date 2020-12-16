package DSAPractice.Strings;
import java.lang.*;

    // Challenge: given a string with a length greater than zero, return the reverse form of the string

public class ReverseString {

    public static String reverseString (String str){
        // create new StringBuilder using String input
        StringBuilder reversedStringBuilder = new StringBuilder(str);

        // reverse the string
        reversedStringBuilder = reversedStringBuilder.reverse();

        // convert StringBuilder to String
        String reverseString = reversedStringBuilder.toString();

        return reverseString;
    }

    public static void main(String[] args) {
        // initialize string
        String taco = "taco";

        // call on method using string you want to reverse
        System.out.println(reverseString(taco));
    }
}
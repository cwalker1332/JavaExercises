package DSAPractice.Strings;

    /*
    Exercise: Given a string, return a string where for every char in the original, there are two chars.
                doubleChar("The") → "TThhee"
                doubleChar("AAbb") → "AAAAbbbb"
                doubleChar("Hi-There") → "HHii--TThheerree"
    */

public class DoubleChar {

    public static String doubleChar(String str){
        // create new, empty string
        String result = "";

        // loop through string
        for(int i = 0; i < str.length(); i++){
            // repeat char at index i and add it to new string
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // should return tthhee
        System.out.println(doubleChar("the"));
    }
}

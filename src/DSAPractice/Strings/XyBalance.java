package DSAPractice.Strings;

    /*
    Exercise: We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
    One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
                  xyBalance("aaxbby") → true
                  xyBalance("aaxbb") → false
                  xyBalance("yaaxbb") → false
     */

public class XyBalance {
    public static boolean xyBalance(String str){
        // if string contains x and y, check to see if the last y appears after the last x
        if (str.contains("x") && str.contains("y")){
            // if last index of y is greater than index of x, return true
            if (str.lastIndexOf("y") > str.lastIndexOf("x")){
                return true;
            }
        // if string does not contain x, return true
        } else if (!str.contains("x")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
        System.out.println(xyBalance("xyx"));
    }
}

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
        // if string contains x, loop through string
        if (str.contains("x")){
            // start i at wherever the first x is
            for (int i = str.indexOf("x"); i <= str.length() - 1; i++) {
                // create temporary string that contains remainder of string following first x
                String temp = str.substring(i, str.length());

                // if remainder of string doesn't contain x and has a y, return true
                if (!temp.contains("x") && temp.contains("y")) {
                    return true;
                }
            }
        // if string doesn't contain x, automatically return true
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

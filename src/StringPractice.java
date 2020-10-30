public class StringPractice {

    /*
        Exercise: Given a string, return a string where for every char in the original, there are two chars.
                doubleChar("The") → "TThhee"
                doubleChar("AAbb") → "AAAAbbbb"
                doubleChar("Hi-There") → "HHii--TThheerree"
    */
    public String doubleChar(String str){
        // create empty string
        String result = "";

        // create for loop to go through string and repeat char at index i
        for(int i = 0; i < str.length(); i++){
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }



    /* Exercise: Return the number of times that the string "hi" appears anywhere in the given string.
                countHi("abc hi ho") → 1
                countHi("ABChi hi") → 2
                countHi("hihi") → 2
    */
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }



    /*
        Exercise: Given a string, return the longest substring that appears at both the beginning and end of
        the string without overlapping. For example, sameEnds("abXab") is "ab".
                sameEnds("abXYab") → "ab"
                sameEnds("xx") → "x"
                sameEnds("xxx") → "x"
     */
    public String sameEnds(String string) {
        String longest = "";
        int midPoint = string.length() / 2;

        for (int i = 0; i < midPoint + 1; i++) {
            String start = string.substring(0, i);
            String end = string.substring(string.length() - i);
            if (start.equals(end)) {
                longest = start;
            }
        } return longest;
    }



    /*
        Exercise: Return true if the string "cat" and "dog" appear the same number of times in the given string.
                catDog("catdog") → true
                catDog("catcat") → false
                catDog("1cat1cadodog") → true
     */

}

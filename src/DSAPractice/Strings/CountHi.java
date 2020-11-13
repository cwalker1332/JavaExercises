package DSAPractice.Strings;

    /*
    Exercise: Return the number of times that the string "hi" appears anywhere in the given string.
                countHi("abc hi ho") → 1
                countHi("ABChi hi") → 2
                countHi("hihi") → 2
    */

public class CountHi {

    public static int countHi(String str) {
        // initialize variable to hold number of "hi"
        int count = 0;

        // loop through string
        for(int i = 0; i < str.length()-1; i++){
            // if two subsequent chars in the string equal "hi", increase count
            if(str.substring(i, i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // call on method using string you want
        // should return 2
        System.out.println(countHi("hihi"));
    }
}

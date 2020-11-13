package DSAPractice.Strings;

    /*
    Exercise: Return true if the string "cat" and "dog" appear the same number of times in the given string.
                catDog("catdog") → true
                catDog("catcat") → false
                catDog("1cat1cadodog") → true
     */

    // TODO: fix

public class CatDog {

    public static boolean catDog (String str) {
        // initialize variable to hold number of times "cat" or "dog" counted/appear
        int catCount = 0;
        int dogCount = 0;

        // loop through string
        for (int i = 0; i < str.length() - 1; i++) {

            // if three subsequent chars in the string equal "cat" or "dog", increase respective count
            if (str.substring(i, i+2).equals("cat")) {
                catCount++;
            } else if (str.substring(i, i+2).equals("dog")){
                dogCount++;
            }
        }

        // if "cat" and "dog" appear the same number of times return true
        if (catCount == dogCount) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // call on method using strings you want
        // should return true
        System.out.println(catDog("catdog"));

        // should return false
        System.out.println(catDog("catcat"));
    }
}

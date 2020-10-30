public class IfElse {
    /*
        Exercise: For this exercise, we will ask the user for two words and two numbers,
        and let the person at the keyboard type in some values, but we will not be storing
        their responses into any variables.
     */



    /*
        Exercise: Given 3 int values, a b c, return their sum. However, if one of the
        values is the same as another of the values, it does not count towards the sum.
                loneSum(1, 2, 3) → 6
                loneSum(3, 2, 3) → 2
                loneSum(3, 3, 3) → 0
    */
    public int loneSum(int a, int b, int c) {
        if (a == b && a == c && b == c){
            return 0;
        } else if (a == b){
            return c;
        } else if (a == c){
            return b;
        } else if (b == c){
            return a;
        } else {
            return a + b + c;
        }
    }
}

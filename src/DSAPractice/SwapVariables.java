package DSAPractice;

public class SwapVariables {

    // Exercise: Given two integers, write a function that swaps them without using any temporary variables.

    public static void main(String[] args) {
        swap(3,5);
    }

    public static void swap(int a, int b){

        // make a = sum of a and b
        a = a + b;

        // make b = a by taking the sum - b
        b = a - b;

        // make a = b by taking the sum - b (which is now = a)
        a = a - b;

        System.out.println("The integers have been swapped. " +
                "a is now equal to " + a + " and b is now equal to " + b);
    }
}

package Challenges;

    /*
    Exercise: Write a Java program to calculate the Fibonacci series both recursively and iteratively.
    It is a series in which the next term is the sum of the preceding two terms.
     */

public class FibonacciSequence {

    // using recursion
    public static int fibonacci (int n) {
        // define base cases
        if (n <= 1) {
            return n;
        } else {
            // num at [n] = num at [n-1] + num at [n-2]
            n = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return n;
    }

    public static void main(String[] args) {
        // iterative method

        // initialize variables
        int n = 100;
        int num1 = 0;
        int num2 = 1;

        // while loop to calculate fibonacci series up to n numbers
        while (num1 <= n) {
            System.out.print(num1 + " + ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        // call on recursive method
        // this method is more efficient memory-wise and cleaner than iterative
        fibonacci(100);
    }
}
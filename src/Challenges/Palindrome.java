package Challenges;
import java.util.Scanner;

//TODO: write descriptions of exercise and add comments and add option to check if an int is a palindrome

public class Palindrome {

    // create scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // call on method
        askForStringOrInteger();
    }

    // ask user if they will be testing an integer or string
    public static void askForStringOrInteger(){
        System.out.println("\nWill you be checking if a string or an integer is a palindrome?\n" +
                "1. String\n" +
                "2. Integer");

        int choice = scanner.nextInt();

        // call on appropriate method based on user's choice
        switch (choice) {
            case 1:
                checkPalindromeString();
                break;
            case 2:
                checkPalindromeInteger();
                break;
            default:
                System.out.println("That was an incorrect input. Please type 1 or 2.");
                askForStringOrInteger();
                break;
        }
    }

    public static void checkPalindromeString() {
        System.out.print("\nEnter the string you would like to test.\n");
        String input = scanner.next();

        // Assuming result to be true
        boolean result = true;
        int length = input.length();

        //dividing the length of the string by 2 and comparing the two
        for (int i = 0; i < length/2; i++) {
            char start = input.charAt(i);
            char end = input.charAt(length - i - 1);

            if (start != end) {
                result = false;
                break;
            }
        }
        System.out.println(input + " is a palindrome = " + result);

        // give user option to test another string
        restart();
    }

    public static void checkPalindromeInteger() {
        System.out.print("\nEnter the integer you would like to test.\n");
        int x = scanner.nextInt();

        // initialize result to be true
        boolean result = true;

        // convert int to String
        int length = Integer.toString(x).length();

        //dividing the length of the int by 2 and comparing the two Strings created
        for (int i = 0; i <= length/2; i++) {
            char start = Integer.toString(x).charAt(i);
            char end = Integer.toString(x).charAt(length - i - 1);

            if (start != end) {
                result = false;
            }
        }
        System.out.println(x + " is a palindrome = " + result);

        // give user option to test another string
        restart();
    }

    public static void restart(){
        System.out.println("\nWould you like to test another string or integer?\n" +
                "1. Yes\n" +
                "2. No");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                askForStringOrInteger();
                break;
            case 2:
                System.out.println("Okay, see you next time! :)");
                System.exit(0);
                break;
            default:
                System.out.println("That was an incorrect input. Please type 1 or 2.");
                restart();
                break;
        }
    }
}
package Challenges;
import java.util.Scanner;

public class Calculator {
    static int calc;
    static int num1;
    static int num2;

    // create new Scanner named input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nHi, welcome to the basic Dream Corp calculator!\n" +
                "Here, you can add, subtract, multiply, or divide integers as well as take the factorial or power of a number.");

        // start calculator
        startCalculator();
    }

    public static void startCalculator(){
        // instruct user to pick an operand then set operator equal to the operand/char they input
        System.out.println("\nPlease pick an operand.");
        char operator = input.next().charAt(0);

        // call on appropriate method based on input
        switch(operator){
            case '+':
                add();
                restart();
                break;
            case '-':
                subtract();
                restart();
                break;
            case '*':
                multiply();
                restart();
                break;
            case '/':
                divide();
                restart();
                break;
            case '!':
                factorial();
                restart();
                break;
            case '^':
                power();
                restart();
                break;
            default:
                System.out.println("That was not a valid input. Please type +, -, *, /, !, or ^.");
                startCalculator();
                break;
        }
    }

    // method to allow user to continue calculating after their first calculation is complete
    public static void restart(){
        System.out.println("\nDid you want to calculate something else?\n" +
                "1. Yes\n" +
                "2. No");

        int choice = input.nextInt();
        switch(choice){
            case 1:
                startCalculator();
                break;
            case 2:
                System.out.println("Okay, see you next time! :)");
                System.exit(0);
                break;
            default:
                System.out.println("That was an invalid input. Please enter 1 or 2.");
                restart();
        }
    }

    // create method for each operation
    public static void add(){
        System.out.println("Please type your first number.");
        num1 = input.nextInt();
        System.out.println("Now type what the number you would like to add to it.");
        num2 = input.nextInt();

        calc = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + calc);
    }

    public static void subtract(){
        System.out.println("Please type your first number.");
        num1 = input.nextInt();
        System.out.println("Now type the number you would like to subtract from it.");
        num2 = input.nextInt();

        calc = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + calc);
    }

    public static void multiply(){
        System.out.println("Please type your first number.");
        num1 = input.nextInt();
        System.out.println("Now type the number you would like to multiply it by.");
        num2 = input.nextInt();

        calc = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + calc);
    }

    public static void divide(){
        System.out.println("Please type your first number.");
        num1 = input.nextInt();
        System.out.println("Now type the number you would like to divide it by.");
        num2 = input.nextInt();

        try {
            calc = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + calc);
        } catch (ArithmeticException e){
            System.out.println("Division by zero is not possible.");
        }
    }

    public static void factorial(){
        System.out.println("Please type your number.");
        num1 = input.nextInt();
        calc = 1;

        if(num1 != 0) {
            for (int i = 1; i <= num1; i++) {
                calc = calc * i;
            }
            System.out.println(num1 + "! = " + calc);
        } else {
            System.out.println("The factorial of 0 is equal to 1");
        }
    }

    public static void power(){
        System.out.println("Please type your base number.");
        num1 = input.nextInt();
        System.out.println("Now type your exponent.");
        num2 = input.nextInt();

        if (num2 != 0) {
            calc = (int) Math.pow(num1, num2);
            System.out.println(num1 + " ^ " + num2 + " = " + calc);
        } else {
            System.out.println("Anything raised to the power of 0 is equal to 1");
        }
    }
}
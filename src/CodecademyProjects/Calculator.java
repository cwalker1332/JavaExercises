package CodecademyProjects;

import java.util.Scanner;

public class Calculator {

    /* switch so operand is chosen first then make if statement so that they only have to pick one number
    if they choose the factorial (!) operand
     */

    public static void main(String[] args) {
        //declare variables to be used
        int num1, num2, calc;

        // create new Scanner named input
        Scanner input = new Scanner(System.in);

        // instruct user to pick an operand then set operator equal to the operand/char they input
        System.out.println("Please pick an operand.");
        char operator = input.next().charAt(0);

        // instruct user to pick a number, or numbers, to be tested
        // num1 is equal to the first integer they input
        // num2 is equal to the second integer they put
        System.out.println("Please type two numbers.");
        num1 = input.nextInt();
        num2 = input.nextInt();

        // create if/else-if statements to tell the calculator what to do with their numbers
        // depending on the operand chosen
        if (operator == '+') {
            calc = num1 + num2;
            System.out.println(calc);

        } else if (operator == '-') {
            calc = num1 - num2;
            System.out.println(calc);

        } else if (operator == '*') {
            calc = num1 * num2;
            System.out.println(calc);

        } else if (operator == '^'){
            if (num2 != 0){
                calc = num1 ^ num2;
                System.out.println(calc);
            } else {
                System.out.println(1);
            }

        } else if (operator == '!'){
            int i;
            for(i = 2; i <= num1; i++){
                calc = num1*i;
                System.out.println(calc);
            }

            // create else if statement to catch if user tries to do the factorial of 0
            // this can also be done with a try/catch statement
            // but did not use this because it had not been covered thus far into the course
        } else if (operator == '!' && num1 == 0){
            calc = 1;
            System.out.println(calc);

        } else if (operator == '/' && num2 != 0) {

            calc = num1 / num2;
            System.out.println(calc);

            // create else if statement to catch if user tries to divide by zero
            // this can also be done with a try/catch statement instead
        } else if (operator == '/' && num2 == 0) {
            System.out.println("Exception caught: Division by zero is not possible.");
        }
    }
}
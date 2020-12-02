package DSAPractice.Arrays;

    /*
        Exercise: Write a function that accepts an array of 10 integers (between 0 and 9),
        that returns a string of those numbers in the form of a phone number.

                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} --> "(123) 456-7890"
     */

public class PhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        // create empty String to add numbers to using StringBuilder
        StringBuilder str = new StringBuilder();

        // loop through array and add appropriate symbols as needed to create phone number
        for(int i = 0; i < numbers.length; i++){
            if (i == 0){
                str.append("(");
                str.append(numbers[i]);
            } else if (i == 2){
                str.append(numbers[i]);
                str.append(") ");
            } else if (i == 5){
                str.append(numbers[i]);
                str.append("-");
            } else {
                str.append(numbers[i]);
            }
        }
        // return StringBuilder converted to String
        return str.toString();
    }

    public static void main(String[] args) {
        // should return "(123) 456-7890"
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}

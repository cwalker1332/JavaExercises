package DSAPractice.Arrays;

    /* Exercise: given an int array of length 1 or more, return the difference
                 between the largest and smallest value in the array

                 [10, 3, 5, 6] --> 7
                 [7, 2, 10, 9] --> 8
     */

public class Difference {
    // create method to calculate difference
    public static int difference(int[] arr){
        // initialize max and min as the first int in array
        int max = arr[0];
        int min = arr[0];

        // loop through array to find max and min values
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        // return the difference between the max and min values
        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 5, 6};
        int[] array2 = {7, 2, 10, 9};

        // should return 7
        System.out.println(difference(array));
        // should return 8
        System.out.println(difference(array2));
    }
}

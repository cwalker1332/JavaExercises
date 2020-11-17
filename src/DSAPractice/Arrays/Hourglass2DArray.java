package DSAPractice.Arrays;
import java.util.ArrayList;
import java.util.Collections;

    /*
        Exercise: Given a 6x6 2D Array, arr, and given that an hourglass follows the following pattern:
                                        a b c
                                          d
                                        e f g
                  Calculate sum of every hourglass in arr then print the maximum hourglass sum
     */

public class Hourglass2DArray {

    public static void main(String[] args) {
        int[][] arr = {{-9, -9, -9, 1, 1, 1},
                        {0, -9, 0, 4, 3, 2},
                        {-9, -9, -9, 1, 2, 3},
                        {0, 0, 8, 6, 6, 0},
                        {0, 0, 0, -2, 0, 0},
                        {0, 0, 1, 2, 4, 0}};

        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        // create new empty ArrayList
        ArrayList<Integer> sums = new ArrayList<>();

        // create nested for loop
        // first for loop loops through the number of arrays
        for(int i = 0; i <= 3; i++){
            // second for loop loops through the ints in each array
            for(int j = 0; j <= 3; j++){
                // hourglassSum is equal to first three indices of first array plus index 1 of second
                // array plus first three indices of third array
                int hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                // add each hourglassSum to arraylist
                sums.add(hourglassSum);
            }
        }
        // sort arraylist from smallest to largest hourglassSum
        Collections.sort(sums);

        // get the largest hourglassSum from arraylist
        // since its sorted, the largest hourglassSum will be at the last index of arraylist
        int maxSum = sums.get(sums.size()-1);

        return maxSum;
    }
}

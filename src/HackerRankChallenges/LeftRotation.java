package HackerRankChallenges;
import java.util.*;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        // d = number of times we need to rotate
        while(d != 0){
            // create variable to hold first number
            int temp = a[0];

            // {2, 1, 2, 3}
            // 1, 2 , 3 , 2
            // 2 3 2 1

            for (int i = 0; i < a.length - 1; i++){
                // rotate to the left by placing value at second index to first index and so on
                a[i] = a[i + 1];
            }

            // put first number at the last index of the array
            a[a.length - 1] = temp;

            // decrease the number of rotations
            d--;
        }
        return a;
    }

    public static void main(String[] args) {
        // initialize array to test
        int[] array = {1, 2, 3, 4};

        // call on method and print. should return {4, 1, 2, 3}
        System.out.println(Arrays.toString(rotLeft(array, 3)));
    }
}

// Alternate solution

/*
    // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
    int n = a.length;

    // Create new array for rotated elements:
    int[] rotated = new int[n];

    // Copy segments of shifted elements to rotated array:
    System.arraycopy(a, d, rotated, 0, n - d);
    System.arraycopy(a, 0, rotated, n - d, d);

    return rotated;
*/
package DSAPractice.Arrays;
import java.util.HashSet;

    /*
        Exercise: Given an unsorted array, find the length of the longest sequence of
        consecutive numbers in the array.
                        consecutive([4, 2, 1, 6, 5]) = 3, [4, 5, 6]
                        consecutive([5, 5, 3, 1]) = 1, [1], [3], or [5]
     */

public class ConsecutiveArray {
    public static int consecutive(int[] arr) {
        // put all the values into a HashSet
        HashSet<Integer> values = new HashSet();

        // add each int in arr to hashset
        for (int integer : arr) {
            values.add(integer);
        }

        // For each value, check if its the first in a sequence of consecutive
        // numbers and iterate through to find the length of the consecutive sequence

        // initialize maxLength
        int maxLength = 0;

        for (int i : values) {
            // if integer is not the leftmost value in the sequence, don't bother
            if (values.contains(i - 1)) continue;
            int length = 0;

            // iterate through sequence
            while (values.contains(i++)) length++;
            // make maxLength the larger value between maxLength and length
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 6, 5};

        // should return 3
        System.out.println(consecutive(arr));
    }
}

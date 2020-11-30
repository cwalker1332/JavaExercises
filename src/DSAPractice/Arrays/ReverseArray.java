package DSAPractice.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

    /*
        Exercise: Given an array of ints length 3, return a new array with
        the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
                       reverse3([1, 2, 3]) → [3, 2, 1]
                       reverse3([5, 11, 9]) → [9, 11, 5]
                       reverse3([7, 0, 0]) → [0, 0, 7]
     */

public class ReverseArray {

    // given a length of three the below method is faster
    public static int[] reverse(int[] nums) {
        int[] numsReversed = {nums[2], nums[1], nums[0]};
        return numsReversed;

        // can also make one line:
        // return new int[]{nums[2], nums[1], nums[0]};
    }

    // TODO: fix
    // if given an unknown length, use this way
    public static int[] reverseArr (int[] nums){
        int[] reversed = new int[nums.length];
        for(int i = 0; i < reversed.length; i++){
            for(int j = nums.length - 1; j >= 0; j--){
                reversed[i] = nums[j];
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println(Arrays.toString(reverse(num)));
        System.out.println(Arrays.toString(reverseArr(num)));
    }
}
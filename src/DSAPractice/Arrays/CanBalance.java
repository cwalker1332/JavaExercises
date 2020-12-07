package DSAPractice.Arrays;

    /*
    Given a non-empty array, return true if there is a place to split the array so that the sum of
    the numbers on one side is equal to the sum of the numbers on the other side.
                canBalance([1, 1, 1, 2, 1]) → true
                canBalance([2, 1, 1, 2, 1]) → false
                canBalance([10, 10]) → true
     */

public class CanBalance {

    public static boolean canBalance(int[] nums) {
        // initialize int var for the sum of first half of arr
        // create nested for loop to run through array from diff sides
        // add up first half to a total var and second half to a separate var
        // if totals are equal return true

        int startSum = 0;

        for(int startIndex = 0; startIndex < nums.length; startIndex++){
            startSum += nums[startIndex];
            int endSum = 0;

            for (int endIndex = nums.length - 1; endIndex > startIndex; endIndex--){
                endSum += nums[endIndex];
            }
            if (startSum == endSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 1, 1, 4};

        System.out.println(canBalance(numbers));
    }
}

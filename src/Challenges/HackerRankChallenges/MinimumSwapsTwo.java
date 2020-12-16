package Challenges.HackerRankChallenges;

//TODO: enter problem or link to problem for each exercise
//TODO: organize directory for categories maybe? can be done later when i complete more of them

public class MinimumSwapsTwo {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        // initialize variable for number of swaps
        int swap = 0;

        for(int i = 0; i < arr.length; i++){
            // if the value at index i is not equal to its index + 1, we'll swap indexes
            // value should equal the index + 1 if its in the correct location
            // ex: index 0 (i) should store the number 1 (i+1) if its stored at the correct index, index 1 should hold 2, etc
            if(arr[i] != i + 1){
                // create temporary variable j to hold index i
                int j = i;

                // while index j is not equal to index i + 1, increase j
                // this is a similar condition as our if statement
                // we'll increase j until it reaches the correct location/index for our current value
                while (arr[j] != i + 1) {
                    j++;
                }

                // create temporary variable to hold index j of our array
                // this j is equal to the correct index for our value
                int temp = arr[j];

                // index j is the correct index for our value so we have to make sure index i matches that
                // make [j] = [i]
                arr[j] = arr[i];

                // increase number of swaps
                swap++;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        // create int array to test
        int[] array = {4, 3, 1, 2};

        // call on method and print. should return 3
        System.out.println(minimumSwaps(array));
    }
}
package DSAPractice.Arrays;

    // Exercise: print elements only in the even indices of an array

public class EvenIndex {

    // initialize the array we want to work with in our main method
    // create another method to return just the even indices of our array
    // inside our method:
        // loop through array starting at index 1 to access all elements of array so we can print just the even indices
        // ignoring index 0 because it is neither even or odd
        // if the index is divisible two with nothing remaining, print element at index

    public static void returnEvenIndex(int[] arr){
        for (int index = 1; index < arr.length; index++) {
            if (index % 2 == 0) {
                System.out.println(arr[index]);
            }
        }
    }

    public static void main(String[] args) {
        // should return 6 and 5
        int[] arrayWeWantToTest = {2, 7, 6, 3, 5, 4};

        returnEvenIndex(arrayWeWantToTest);
    }
}

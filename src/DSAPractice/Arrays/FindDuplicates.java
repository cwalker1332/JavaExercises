package DSAPractice.Arrays;

    // Exercise: Write a method that finds all the duplicates in the array

public class FindDuplicates {

    public static String findDuplicates(char[] arr){
        // create empty String builder to add duplicates to
        StringBuilder duplicates = new StringBuilder();

        // nested for loop to run through the string from two different start points
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // if the indexes are not the same and they hold the same char
                if (j != i && arr[j] == arr[i]) {
                    // add char at that index to duplicates StringBuilder
                    duplicates.append(arr[i]);
                }
            }
        }

        return duplicates.toString();
    }


    public static void main(String[] args) {
        char[] arr = {'a','b','a','b'};

        System.out.println(findDuplicates(arr));
    }
}

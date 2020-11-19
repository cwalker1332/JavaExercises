package DSAPractice.Strings;
import java.util.ArrayList;
import java.util.Scanner;

    // Exercise: Write an autocomplete class that returns all dictionary words with a given prefix.

public class Autocomplete {

    // create global scanner
    static Scanner scan = new Scanner(System.in);

    // have next char input by user stored as a global char variable
    static char input = scan.nextLine().charAt(0);

    public static void main(String[] args) {
        // create string array holding your dictionary words
        String[] dictionary = {"android", "alternate", "beta", "definition", "apple", "basketball"};

        // call method
        System.out.println(autocomplete(dictionary));
    }

    public static ArrayList<String> autocomplete(String[] arr) {
        // create empty arraylist to take in strings
        ArrayList<String> temp = new ArrayList<>();

        // for each string in our array
        for (String str : arr) {
            // if the first char is of the string is equal to the input add it to the arraylist
            if (str.charAt(0) == input) {
                temp.add(str);
            }
        }
        return temp;
    }
}

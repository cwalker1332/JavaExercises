package DSAPractice.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

    /*
        Exercise: complete the exercise AND calculate the worst-case runtime in Big-O notation of your solution.
        Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the
        number could represent.
        Note that 1 does not map to any letters.

        Ex:
        Input: "23"
        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     */

public class PhoneDigits {

    public static ArrayList<String> digitsToLetters(String digits){
        // create hashmap that contains the corresponding letters to each digit
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        // create empty arraylist that takes in strings
        ArrayList<String> combos = new ArrayList<>();

        // if an empty string is given, return the empty string
        if (digits == null || digits.length() == 0) {
            return combos;
        }

        combos.add("");

        //
        for (int i = 0; i < digits.length(); i++) {
            // create temp array list
            ArrayList<String> temp = new ArrayList<>();
            String option = map.get(digits.charAt(i));

            for (int j = 0; j < combos.size(); j++) {
                for (int k = 0; k < option.length(); k++) {
                    temp.add(new StringBuilder(combos.get(j)).append(option.charAt(k)).toString());
                }
            }

            combos.clear();
            combos.addAll(temp);
        }

        return combos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(digitsToLetters(input));
    }
}

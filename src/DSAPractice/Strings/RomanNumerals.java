package DSAPractice.Strings;
import java.util.TreeMap;

// Exercise: Given an integer, write a function to return its roman numeral representation

// this is purely for me to try and understand another person's logic. I could not solve this one on my own.
// all comments are my interpretation of what is happening in their code

public class RomanNumerals {

    // answer from internet using TreeMap and recursion
    private final static TreeMap<Integer, String> map = new TreeMap<>(){{

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }};

    public final static String iToRoman(int number) {
        int l = map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + iToRoman(number-l);
    }



    // alternate internet answer using two arrays and while loop
    private static final String[] numerals =
            new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                    "V", "IV", "I"};
    private static final int[] values =
            new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String integerToRoman(int value) {
        // We are only considering the range for standard roman numerals
        if (value > 3999 || value < 1) throw new IllegalArgumentException();

        StringBuilder numeral = new StringBuilder();
        int i = 0;
        // Greedily append the largest numeral possible until the value is 0
        while (value > 0) {
            // if num input minus values is negative increase index and continue until its positive
            // when it is positive, add the roman numeral to empty string
            if (value - values[i] >= 0) {
                numeral.append(numerals[i]);
                value -= values[i];
            } else {
                i++;
            }
        }
        return numeral.toString();
    }

    public static void main(String[] args) {
        System.out.println(integerToRoman(12));
    }
}
package DSAPractice.Maps;

import java.util.Map;
import java.util.HashMap;

    /*
        Exercise: Given an array of strings, return a Map<String, Integer> containing a
        key for every different string in the array, and the value is that string's length.
     */

public class WordLen {
    public static void main(String[] args) {
        String[] array = {"a", "bb", "a", "bb"};
        System.out.println(wordLen(array));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        // create empty map
        Map<String, Integer> map = new HashMap<>();

        // for each string in strings, add string(key) and string length(value) to map
        for (String str : strings){
            map.put(str, str.length());
        }

        return map;
    }
}

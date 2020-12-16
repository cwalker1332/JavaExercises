package DSAPractice.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsAlt {

    public static ArrayList<String> charToStringArrayList(char[] message){
        // create empty string using StringBuilder
        StringBuilder str = new StringBuilder();

        // create empty ArrayList
        ArrayList<String> arr = new ArrayList<>();

        for (char letter : message){
            // for each letter in message, add to empty string called str
            str.append(letter);

            // if you reach a space or the end of the message
            if (letter == message[message.length - 1] || letter == ' '){
                // make str a string and add it to our ArrayList
                arr.add(str.toString());

                // make str empty again so we create a new string
                str = new StringBuilder();
            }
        }

        // reverse order of strings in our ArrayList
        Collections.reverse(arr);

        return arr;
    }

    public static void main (String[] args) {
        char[] cake = {'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l'};

        System.out.println(charToStringArrayList(cake));
    }
}
package DSAPractice.Strings;

public class ReverseWords {

    public static char[] reverseChar(char[] message, int leftIndex, int rightIndex) {

        while (leftIndex < rightIndex) {
            // create variable to hold first letter
            char temp = message[leftIndex];

            // swap the left char and right char
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return message;
    }

    public static char[] reverseWords(char[] message){

        // first we reverse all the characters in the entire message
        reverseChar(message, 0, message.length - 1);
        // this gives us the right word order
        // but with each word backwards

        // now we'll make the words forward again
        // by reversing each word's characters

        // we hold the index of the *start* of the current word
        // as we look for the *end* of the current word
        int currentWordStartIndex = 0;
        for (int i = 0; i <= message.length; i++) {

            // found the end of the current word!
            if (i == message.length || message[i] == ' ') {

                // if we haven't exhausted the string our
                // next word's start is one character ahead
                reverseChar(message, currentWordStartIndex, i - 1);
                currentWordStartIndex = i + 1;
            }
        }

        return message;
    }

    public static void main (String[] args) {
        char[] cake = {'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l'};
        System.out.println(reverseWords(cake));
    }
}
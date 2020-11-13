package DSAPractice.Arrays;

    // Exercise: print an array using a while, for, and for-each loop
    // TODO: split loop types into separate methods

public class LoopArray {

    public static void main(String[] args) {
        String[] names = {"Courtney", "Jayna", "Boubacar", "Glorina"};

        // while loop
        int i = 0;
        while(i < 4){
           System.out.println(names[i]);
           i++;
       }

        // for loop
        for(i = 0; i < names.length; i++){
           System.out.println(names[i]);
        }

        // for each loop
        for (String name : names){
           System.out.println(name);
        }
    }
}

public class Arrays {

    /*
        Given a non-empty array, return true if there is a place to split the array so that the sum of
        the numbers on one side is equal to the sum of the numbers on the other side.
                canBalance([1, 1, 1, 2, 1]) → true
                canBalance([2, 1, 1, 2, 1]) → false
                canBalance([10, 10]) → true
     */



    // Exercise: print an array using a while, for, and for-each loop
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

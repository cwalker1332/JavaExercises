package DSAPractice.Strings;

    /*
        Exercise: Implement a function likes :: [String] -> String, which must take in input array,
        containing the names of people who like an item. It must return the display text as shown in the examples:
                likes {} // must be "no one likes this"
                likes {"Peter"} // must be "Peter likes this"
                likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
                likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
                likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
     */

public class WhoLikesIt {

    public static String whoLikesIt(String[] names) {
        if (names.length > 3) {
            int numLikesLeft = names.length - 2;
            return names[0] + ", " + names[1] + " and " + numLikesLeft + " others like this";
        } else if (names.length == 3){
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else {
            return "no one likes this";
        }
    }

    public static void main(String[] args) {
        String[] noLikes = {};
        String[] likes1 = {"Peter"};
        String[] likes2 = {"Jacob", "Alex"};
        String[] likes3 = {"Max", "John", "Mark"};
        String[] likes4 = {"Alex", "Jacob", "Mark", "Max"};

        // should return "no one likes this"
        System.out.println(whoLikesIt(noLikes));
        // should return "Peter likes this"
        System.out.println(whoLikesIt(likes1));
        // should return "Jacob and Alex like this"
        System.out.println(whoLikesIt(likes2));
        // should return "Max, John and Mark like this"
        System.out.println(whoLikesIt(likes3));
        // should return "Alex, Jacob and 2 others like this"
        System.out.println(whoLikesIt(likes4));
    }
}

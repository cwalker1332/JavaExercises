package DSAPractice.Strings;

    /*
        Interview question:
        A truck’s route involves adding and removing boxes along a route, defined as a string in the format:
                            "+2b50 -50 +10b200"
        Where + denotes adding weight and – denotes removed weight, what is the total weight of the truck's load?
     */

public class TruckLoad {

    public static int totalLoad(String input) {
        // initialize total load to 0
        Integer totalLoad = 0;

        // split input into an array of strings using the space between loads
        String[] loads = input.split(" ");

        // go through each load/string to see if it contains b/boxes
        for (String load : loads) {
            // if load contains multiple boxes and starts with a +, multiply number of boxes by load and add to total load
            if (load.charAt(0) == '+' && load.contains("b")) {
                // replace '+' with zero so it does not affect count
                load.replace('+', '0');
                // split load into substrings using the b, so that the 0 index is the noBoxes and 1 index is weight
                String[] subString = load.split("b");
                totalLoad += Integer.valueOf(subString[0]) * Integer.valueOf(subString[1]);
            // if load contains multiples boxes and starts with -, multiply number of boxes by load and remove from total load
            } else if (load.charAt(0) == '-' && load.contains("b")) {
                load.replace('-', '0');
                String[] subString = load.split("b");
                totalLoad -= Integer.valueOf(subString[0]) * Integer.valueOf(subString[1]);
            // if load does not contain multiple boxes but has +, add to total load
            } else if (load.charAt(0) == '+') {
                load.replace('+', '0');
                totalLoad += Integer.valueOf(load);
            // if load does not contain multiple boxes but has -, remove from total load
            } else if (load.charAt(0) == '-') {
                load.replace('-', '0');
                totalLoad += Integer.valueOf(load);
            }
        }
        return totalLoad;
    }

    public static void main(String[] args) {
        // should return 2050
        System.out.println(totalLoad("+2b50 -50 +10b200"));
    }
}
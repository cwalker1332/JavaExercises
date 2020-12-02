package DSAPractice.Strings;

public class TruckLoad {

    public static int totalLoad(String input) {
        Integer totalLoad = 0;
        String[] loads = input.split(" ");
        for (String load : loads) {
            if (load.charAt(0) == '+' && load.contains("b")) {
                load.replace('+', '0');
                String[] subString = load.split("b");
                totalLoad += Integer.valueOf(subString[0]) * Integer.valueOf(subString[1]);
            } else if (load.charAt(0) == '-' && load.contains("b")) {
                load.replace('-', '0');
                String[] subString = load.split("b");
                totalLoad -= Integer.valueOf(subString[0]) * Integer.valueOf(subString[1]);
            } else if (load.charAt(0) == '+') {
                load.replace('+', '0');
                totalLoad += Integer.valueOf(load);
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

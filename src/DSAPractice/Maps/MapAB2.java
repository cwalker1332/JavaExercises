package DSAPractice.Maps;
import java.util.HashMap;
import java.util.Map;

    /*
        Modify and return the given map as follows: if the keys "a" and "b" are both
        in the map and have equal values, remove them both.
                    mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
                    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
                    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */

public class MapAB2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");

        System.out.println(mapAB2(map));
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {

        if (map.get("a") == map.get("b")){
            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}

package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("ram", 2);
        map.put("shyam", 22);

        System.out.println(map.get("ram"));
        System.out.println(map.get("shyam"));
        System.out.println(map.size());
    }
}

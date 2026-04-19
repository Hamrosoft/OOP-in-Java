package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("ram", 2);
        map.put("shyam", 22);

        // System.out.println(map.get("ram"));
        // System.out.println(map.get("shyam"));
        // System.out.println(map.size());

        // check whether key exists or not
        System.out.println(map.containsKey("ram")); // will return true because `ram` exists in the map

        System.out.println(map.containsKey("shyamkumar")); // will return false because `shyamkumar` does not exist in the map

        // map.clear();

        System.out.println(map.size() + " is the size of the map after clearing.");

        Map<String, Integer> students = new HashMap<>();
        students.putAll(map);

        System.out.println(students.size());


        
    }
}

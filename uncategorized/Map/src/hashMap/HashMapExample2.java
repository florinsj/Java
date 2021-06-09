package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Grapes");
        map.put(1, "Apple"); //try to duplicate key

        System.out.println("Iterating HashMap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

package hashMap;

import java.util.HashMap;

public class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Andrei");
        map.put(101, "Andreea");
        map.put(102, "Roberto");
        map.put(103, "Roberta");
        System.out.println("Initial elements in map " + map);

        //remove entry by key
        map.remove(100);
        map.remove(101);

        System.out.println("Element in map after remove" + map);


    }
}

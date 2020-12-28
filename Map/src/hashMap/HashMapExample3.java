package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {
    public static void main(String[] args) {
        //create a hashMap hm1
        HashMap<Integer, String> hm1 = new HashMap<>();
        System.out.println("Initial list of hashmap..." + hm1);
        hm1.put(100, "Marius");
        hm1.put(101, "Adina");
        hm1.put(102, "Dana");

        System.out.println("Elements of hashmap after put() method..");
        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm1.putIfAbsent(103, "Madalina");
        System.out.println("Elements of hashmap after putIfAbsent() method..");
        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //create another hashMap  hm2
        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(104, "Mihai");
        //put hm1 in hm2
        hm2.putAll(hm1);
        System.out.println("hm2 after putAll() method...");
        for (Map.Entry m : hm2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}

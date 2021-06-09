package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(100,"Ion");
        hm.put(101,"Ioana");
        hm.put(102,"Dan");
        hm.put(103,"Dana");
        System.out.println("Initial elements in hashmap ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.replace(102,"George");
        System.out.println("Elements in hashmap after replace ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.replace(101,"Ioana","Ionel");
        System.out.println("Elements in hashmap after second replace ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.replaceAll((k,v)->"Tedy");
        System.out.println("Elements in hashmap after second replace ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

package types.map.hashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {

    public static class HashMapIteration {
        public static void main(String[] args) {
            //create
            HashMap<String, Integer> hashMap = new HashMap<>();

            //Insert - O(1)
            hashMap.put("India", 100);
            hashMap.put("China", 150);
            hashMap.put("US", 2000);
            //Iterative
            Set<String> keys = hashMap.keySet();
            System.out.println(keys);

            for (String k : keys) {
                System.out.println("key=" + k + ",value=" + hashMap.get(k));
            }
        }
    }
}
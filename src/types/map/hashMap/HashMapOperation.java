package types.map.hashMap;

import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hashMap = new HashMap<>();

        //Insert - O(1)
        hashMap.put("India",100);
        hashMap.put("China",150);
        hashMap.put("US",2000);
        System.out.println(hashMap);

        //Get - O(1)
        int population = hashMap.get("India");
        System.out.println("Value of India is :"+population);

        //containsKey O(1)
        System.out.println(hashMap.containsKey("India"));
        System.out.println(hashMap.containsKey("Indonesia"));

        //Remove
        System.out.println(hashMap.remove("China"));
        System.out.println(hashMap);
    }
}

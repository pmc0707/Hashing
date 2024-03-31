package types.map.linkedHasmap;
import java.util.LinkedHashMap;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap <String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("India",100);
        linkedHashMap.put("China",500);
        linkedHashMap.put("US",450);
        System.out.println(linkedHashMap);
    }
}

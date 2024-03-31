package types.set.linkedHashset;

import java.util.LinkedHashSet;

public class LinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Delhi");
        linkedHashSet.add("Mumbai");
        linkedHashSet.add("Chennai");
        linkedHashSet.add("Noida");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("Noida");
        System.out.println(linkedHashSet);
    }
}

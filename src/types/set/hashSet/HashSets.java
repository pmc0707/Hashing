package types.set.hashSet;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.remove(1);
        System.out.println(hashSet);
        if(hashSet.contains(2)){
            System.out.println("set contain 2");
        } if(hashSet.contains(4)){
            System.out.println("set contain 4");
        }
    }

}

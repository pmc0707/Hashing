package types.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSets = new HashSet<>();
        hashSets.add("delhi");
        hashSets.add("mumbai");
        hashSets.add("kolkata");
        hashSets.add("chennai");
        //{iterative for loop}
//        Iterator iterator = hashSets.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());

        //enhance for loop
        for(String hashSet : hashSets){
            System.out.println(hashSet);
        }
    }
}

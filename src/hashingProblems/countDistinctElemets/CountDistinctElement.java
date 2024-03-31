package hashingProblems.countDistinctElemets;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        int [] numbers = {4,3,5,6,3,2,5,4,2,3,7};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int index = 0; index < numbers.length; index++) {
            hashSet.add(numbers[index]);
        }
        System.out.println("ans = " +hashSet.size());
    }
}

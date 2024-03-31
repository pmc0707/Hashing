package hashingProblems.majorityElement.approch2;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int [] numbers = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
           hashMap.put(numbers[index],hashMap.getOrDefault(numbers[index],0)+1);
        }
        for(Integer key : hashMap.keySet()){
            if(hashMap.get(key) > numbers.length/3){
                System.out.println(key);
            }
        }
    }
}
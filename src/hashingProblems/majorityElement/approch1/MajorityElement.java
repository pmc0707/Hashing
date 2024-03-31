package hashingProblems.majorityElement.approch1;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int [] numbers = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
            if(hashMap.containsKey(numbers[index])){
                hashMap.put(numbers[index],hashMap.get(numbers[index]+1));
            } else {
                hashMap.put(numbers[index],1);
            }
        }
        Set<Integer> keySet = hashMap.keySet();
        for(Integer key : keySet){
            if(hashMap.get(key) > numbers.length/3){
                System.out.println(key);
            }
        }
    }
}

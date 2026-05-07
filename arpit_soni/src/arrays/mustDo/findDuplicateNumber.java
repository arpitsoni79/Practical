package arrays.mustDo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 7,5};

        Set<Integer> newSet = new HashSet<>();
        for (int i : arr) {
            if(!newSet.add(i)){
                System.out.println("deplicate no " + i);
            }
        }

        Map<Integer, Integer> newMap = new HashMap<>();
        for (int i : arr){
            newMap.put(i, newMap.getOrDefault(i, 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry : newMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("deplicate of " + entry.getKey() +" is " + entry.getValue());
            }
        }
        System.out.println(newMap);

    }
}
package arrays.veryFrequent;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int target = 5;

        System.out.println(allUniquePairs(arr, target));

    }

    static Set<String> allUniquePairs(int[] arr, int target) {

        Set<Integer> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (seen.contains(complement)) {
                int a = Math.min(arr[i], complement);
                int b = Math.max(arr[i], complement);
                result.add(a + "," + b);
            }
            seen.add(arr[i]);
        }

        return result;
    }
}

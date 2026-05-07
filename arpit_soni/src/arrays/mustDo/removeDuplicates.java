package arrays.mustDo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class removeDuplicates {
    public static  void  main(String[] args){
        int[] arr = {1,2,3,4,8,2};
        int[] res = new int[arr.length];
        int a=0;
        // using stream
        //System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
       // Arrays.sort(arr);
        Set<Integer> newSet = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            newSet.add(arr[i]);
        }
        System.out.println(newSet);
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0;j<arr.length-1; j++){
//            if(){
//                 a= arr[j];
//            }
//           res[i]=a;
//
//            }
//        }
       // System.out.println(Arrays.toString(arr));

    }
}

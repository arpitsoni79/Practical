package arrays.mustDo;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class kthLargestSmallestInArray {

    public static void main(String[] args){
       // var data =List.of(1,2,3,4,5);
       // System.out.println(data.stream().skip(data.size()-1).findFirst().get());
        int[] arr = {1,2,3,4,5};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]); // arr[arr.length -k] for kth largest
        System.out.println(arr[2]);            // for arr[k-1] for kth smallest

        //another way is using priority que.
        PriorityQueue<Integer> res = new PriorityQueue<>();
        for (int i=0; i< arr.length; i++){
            res.offer(arr[i]);
            if(res.size()>k){
                res.poll();
            }

        }
        System.out.println(res.peek());
        //kth smallest
        PriorityQueue<Integer> resSmall = new PriorityQueue<>(Collections.reverseOrder());
        int[] small = {4,5,8,2};
        for (int i=0; i<small.length; i++){
            resSmall.offer(small[i]);
            if(resSmall.size()>k){
                resSmall.poll();
            }
        }
        System.out.println(resSmall.peek());


    }

}





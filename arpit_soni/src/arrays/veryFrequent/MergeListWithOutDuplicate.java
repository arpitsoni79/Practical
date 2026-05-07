package arrays.veryFrequent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeListWithOutDuplicate {

    public static void main (String[] args){
        List<Integer> l1 = List.of(1,2,3,4);
        List<Integer> l2 = List.of(4,5,6);
        List<Integer> l3 = List.of(6,8,9);

        List<Integer> result = Stream.of(l1, l2, l3).flatMap(List::stream).distinct().toList();


        System.out.println(result);
    }
}

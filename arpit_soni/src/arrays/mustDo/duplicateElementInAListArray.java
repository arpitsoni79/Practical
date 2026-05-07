package arrays.mustDo;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateElementInAListArray {
    public static void main(String[] args) {

        //list -> map , frequency, 1,2,4,1,2
        //map -> collector .grouping by
        List<Integer> given = List.of(1, 2, 2, 3, 4, 5, 5);



        System.out.println(given.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e-> e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).toString());



    List<Integer> second = List.of(1, 1, 3, 1, 5, 7, 8, 7);
    Set<Integer> res = new HashSet<>();
    Set<Integer> duplicates = new HashSet<>();
    for(int i=0 ;i<second.size(); i++) {
        if (!res.add(second.get(i))) {
            duplicates.add(second.get(i));
        }

    }
        System.out.printf(duplicates.toString());
}

}

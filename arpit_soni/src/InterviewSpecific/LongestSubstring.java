package InterviewSpecific;

import java.util.*;

public class longestSubstring {

    public static void main (String[] args){
        String given = "arpitap";
       // Set<Character> subString = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int right=0; right<given.length(); right++){
           char current = given.charAt(right);
           if (map.containsKey(current)) {
               left = Math.max(left, map.get(current)+1);
           }
           map.put(current, right);
           max = Math.max(max, right-left+1);
        }
//        for (int right=0; right<given.length(); right++){
//           char current = given.charAt(right);
//            while(subString.contains(current)){
//                subString.remove(given.charAt(left));
//                left++;
//            }
//
//            subString.add(current);
//            max = Math.max(max, right-left+1);
//        }
        System.out.println("longest Substring contains "+max+ " characters."+ map);
    }
}

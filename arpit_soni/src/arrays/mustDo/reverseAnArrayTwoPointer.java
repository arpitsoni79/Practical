package arrays.mustDo;

import java.util.Arrays;

public class reverseAnArrayTwoPointer {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));;
        //time O(n) space O(1)
    }
    static int[] reverse (int[] arr){
        int left=0;
        int right = arr.length-1;

        while(left<right){
            //it can be done using XOR(^) also but not practical and using mathmatical operation also
            // a=a+b; b=a-b; a=a-b;

            int temp;
            temp=arr[left];
            arr[left]= arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

}

package arrays.mustDo;

import java.util.Arrays;

public class rotateArrayByKStepBruteforce {
    public static void main (String[] args){
        int[] arr = {1,5,7,2,3};

        int k = 3;
        int last =0;
        int first =0;

        //logic for right side rotation
        for(int i=0; i< k; i++){
            last = arr[arr.length-1];
            for (int j=arr.length-1; j>0; j--){
                arr[j]= arr[j-1];
            }
            arr[0] = last;

        }
        System.out.println(Arrays.toString(arr));
    //logic for left side rotation
        for(int i=0; i< k; i++){
            first = arr[0];
            for (int j=0; j<arr.length-1; j++){
                arr[j]= arr[j+1];
            }
            arr[arr.length-1] = first;

        }
        System.out.println(Arrays.toString(arr));
    }
}

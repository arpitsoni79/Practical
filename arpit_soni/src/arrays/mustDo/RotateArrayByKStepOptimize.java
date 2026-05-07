package arrays.mustDo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArrayByKStepOptimize {
    public void main(String[] args){
        int[] arr = {1, 5, 7, 2, 3};
        int k = 3;
        int l = arr.length;
        //rotateByStream(arr, k);


        rotateArrayoptimize(arr, 0, k-1);
        rotateArrayoptimize(arr, k, l-1);
        rotateArrayoptimize(arr, 0, l-1);

        System.out.println(Arrays.toString(arr));

    }
    //void rotateByStream(int[] arr, int k) {
       /* int[] res = IntStream.concat(
                Arrays.stream(arr, arr.length-k ,arr.length ),
                Arrays.stream(arr, 0, arr.length-k)
        ).toArray();*/

        
      //  System.out.println(Arrays.toString(res));
    //}

    void rotateArrayoptimize(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
}





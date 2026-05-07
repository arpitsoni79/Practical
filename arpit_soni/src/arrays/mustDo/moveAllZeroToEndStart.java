package arrays.mustDo;

import java.util.Arrays;

public class moveAllZeroToEndStart {

    public static void main (String[] args){
        int[] arr = {0,1,0,2,5};
        int index=0;
        int index_a = arr.length-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
         while(index<arr.length){
            arr[index++] =0;
        }

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] != 0){
                arr[index_a--] = arr[i];
            }
        }
         while(index_a>=0){
            arr[index_a--] = 0; 
        }

        /* for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        int[] temp = new int[count];
        for (int i=0; i==count; i++){
            temp[i] = 0;
        }
        System.out.println(Arrays.toString(temp));*/
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while(start<end && arr[start]==0 && arr[end] !=0){
          //  int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = 0;
            start++;
            end--;
        }*/

        System.out.println(Arrays.toString(arr));
    }
}

package arrays.mustDo;

public class checkIfArraySorted {
    public static void main (String[] args){
        int[] arr = {1,1,2,4,5};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("sorted");
        int[] revArr = {5,1,3,2,1};
        for(int i=0; i<revArr.length-1; i++){
            if((revArr[i]<revArr[i+1])){
                System.out.println("not reverse sorted");
                return;
            }
        }
        System.out.println("reverse sorted");
    }

}

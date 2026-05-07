package arrays.mustDo;

public class secondLargestSecondSmallest {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        //this also can be done by just sorting array and 2nd smallest will be arr[1] index element
        // and 2nd largest will be arr[arr.length-2] index element time will be O(n log n)
        secondlargeSmall(arr);
        //time O(n) space O(1)
    }
    static void secondlargeSmall(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i=0; i<arr.length ; i++){
            //2nd largest
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else {
                if(arr[i]>secondMax && arr[i]!=max){
                    secondMax = arr[i];
                }

            }
            //2nd smallest
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else {
                if(arr[i]<secondMin && arr[i]!=min){
                    secondMin = arr[i];
                }

            }
        }
        System.out.println(secondMax + " 2nd max");
        System.out.println(secondMin + " 2nd min");
    }
}

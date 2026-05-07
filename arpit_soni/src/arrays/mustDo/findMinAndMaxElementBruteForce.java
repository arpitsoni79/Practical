package arrays.mustDo;

public class findMinAndMaxElementBruteForce {

    public static void main (String[] args){

        int[] arr = {1,2,3,4,5};
        minAndMax(arr);

    }

    static void minAndMax(int[] arr){

        if(arr == null || arr.length ==0){
            System.out.println("Aray is empty");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i=1; i< arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " min");
        System.out.println(max + " max");
    }
}
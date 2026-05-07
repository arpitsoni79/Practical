package arrays.mustDo;

public class findMissingNumber {
    public static void main (String[] args){
        int[] arr = {1,2,3,5,6,7};
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int i : arr){
            actualSum +=i;
        }
        System.out.println("missing no " + (expectedSum-actualSum));


        int[] abc = {5,1,3};
        int b = 5;
        boolean[] present = new boolean[b+1];
        for (int i=0; i<abc.length; i++){
            present[abc[i]] = true;
        }
        for(int i =1; i<b ; i++){
            if(!present[i]){
                System.out.println("missing number "+ i);
            }
        }
    }

}

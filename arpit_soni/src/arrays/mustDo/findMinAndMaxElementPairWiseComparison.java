package arrays.mustDo;

public class findMinAndMaxElementPairWiseComparison {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        minAndMax(arr);
    }

    static void minAndMax(int[] arr) {
        int min, max, i = 0;
        //check for total element is even or add to make pairs.
        if (arr.length % 2 == 0) {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        } else {
            min = max = arr[0];
            i = 1;
        }

        for (; i < arr.length - 1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                } else {
                    if (arr[i + 1] < min) {
                        min = arr[i + 1];
                    }
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
        }
        System.out.println(min + " min");
        System.out.println(max + " max");
    }
}

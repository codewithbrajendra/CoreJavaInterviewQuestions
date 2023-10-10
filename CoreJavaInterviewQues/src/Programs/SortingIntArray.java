package Programs;

import java.util.Arrays;

public class SortingIntArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,3};
        System.out.println("Before Sorting ::: "+ Arrays.toString(arr));

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After Sorting ::: "+Arrays.toString(arr));
    }
}

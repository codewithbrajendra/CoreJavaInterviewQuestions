package Programs;

import java.util.Arrays;

public class SortingIntArrayWithSingleLoop {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,5,3};
        System.out.println("Before Sorting ::: "+ Arrays.toString(arr));

        for (int j = 0; j < arr.length - 1; j++)
        {
            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1])
            {
                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }
        System.out.println("After Sorting ::: "+ Arrays.toString(arr));
    }
}

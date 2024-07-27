package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElementArray_1 {

    public static void main(String[] args) {
        System.out.println("Find second largest element in array");

        int[] arr1={7,5,6,1,4,2};
        Integer integer = Arrays.stream(arr1)
                .boxed()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(integer);

    }
}

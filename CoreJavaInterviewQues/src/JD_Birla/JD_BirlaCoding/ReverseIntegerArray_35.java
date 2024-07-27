package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray_35 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reverseArray = IntStream.rangeClosed(1,array.length)
                .map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(reverseArray));
    }
}

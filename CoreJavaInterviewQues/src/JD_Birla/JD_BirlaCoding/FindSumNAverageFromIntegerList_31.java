package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;

public class FindSumNAverageFromIntegerList_31 {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        Integer sum = Arrays.stream(a).sum();
        System.out.println("sum "+sum);

        Double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average "+average);
    }
}

package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfDigitsFromInteger_29 {

    public static void main(String[] args) {
        int i = 15623;
        Integer sum = Arrays.stream(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }

}

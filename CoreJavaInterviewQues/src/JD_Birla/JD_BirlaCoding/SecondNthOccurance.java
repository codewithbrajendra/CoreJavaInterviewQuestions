package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNthOccurance {

    public static void main(String[] args) {
        String stJitendra = "aaababddd";
        Map<String, Long> collect = Arrays.stream(stJitendra.split("")).collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));
        String s = collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(2)
                .skip(1).map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println(" String :"+s);
    }
}

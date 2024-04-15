package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostOccurance {

    public static void main(String[] args) {
        String stJitendra = "aaababddd";
        Map<String, Long> collect = Arrays.stream(stJitendra.split("")).collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()));

        LinkedHashMap<String, Long> collect1 = collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(2)
                .skip(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        collect1.forEach((k,v) -> System.out.println("collect1 :->"+ k +" : "+v));
    }
}

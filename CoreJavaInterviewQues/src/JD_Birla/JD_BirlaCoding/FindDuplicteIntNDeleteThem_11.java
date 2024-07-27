package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicteIntNDeleteThem_11 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 1);
        Map<Integer, Long> countNum = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> nums = countNum.entrySet().stream().filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(nums);

     }
}

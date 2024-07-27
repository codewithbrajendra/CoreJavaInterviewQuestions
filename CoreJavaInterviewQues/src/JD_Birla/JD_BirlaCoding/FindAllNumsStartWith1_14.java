package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNumsStartWith1_14 {

    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<String> nums = myList1.stream().map(n -> n.toString()).filter(n -> n.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(nums);
    }

}

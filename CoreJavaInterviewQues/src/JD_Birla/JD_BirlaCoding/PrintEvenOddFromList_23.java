package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintEvenOddFromList_23 {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> mapEvenOdd = listOfIntegers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(mapEvenOdd);

        Set<Map.Entry<Boolean, List<Integer>>> entrySet = mapEvenOdd.entrySet();
        for(Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            if(entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            System.out.println("--------------------------------------");
            for(Integer i : entry.getValue()) {
                System.out.println(i);
            }
        }


    }
}

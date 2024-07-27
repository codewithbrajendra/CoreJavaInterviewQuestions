package JD_Birla.JD_BirlaCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValOfListInteger_16 {

    public static void main(String[] args) {
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        //1st Way
       // myList3.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

       //2nd Way
      // myList3.stream().distinct().collect(Collectors.maxBy(Comparator.comparing(Integer::intValue)))
      //         .ifPresent(System.out::println);

     //3rd Way
Integer maxVal = myList3.stream().sorted(Comparator.comparing(Integer::intValue).reversed())
        .findFirst().get();
        System.out.println(maxVal);

    }
}

package Java8_Practices;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8CodingTest {

    public static void main(String[] args) {
        //
        /*String str1 = "Kavyanshi Khare";


        String str2 = "Hello Welcome to the Java World.";
        //Find out non repeated character of strings in given string
        Map<String, Long> collect1 = Arrays.stream(str2.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect1);

        collect1.forEach((ch,len) -> {
            if(len < 1) {
                System.out.println(ch + " = "+len);
            }
        });
        //
        List<String> words = Arrays.asList(str2.split(" "));
       String output = Stream.of(words.get(0),words.get(1),words.get(2),words.get(3),words.get(5),words.get(4)).collect(Collectors.joining(" "));
        System.out.println(output);*/

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(l -> l%2 == 0));
        System.out.println(collect);


    }
}

package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctMethod {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mona","Ranu","Shikha","Ranu","Diksha");
        System.out.println("Before Distinct Names ::: "+names);

        List<String> distinctNames = names.stream().distinct().collect(Collectors.toList());
        System.out.println("After Distinct Names ::: "+distinctNames);

        List<Integer> numbers = Arrays.asList(5,3,6,9,7,3);
        System.out.println("Before Distinct Numbers ::: "+numbers);

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("After Distinct Numbers ::: "+distinctNumbers);
    }

}


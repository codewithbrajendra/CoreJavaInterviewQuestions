import Java8_Practices.Employee;
import Java8_Practices.EmployeeDatabase;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static <Employee> void main(String[] args) {
        //System.out.println("Hello world!!!");

        /*6
        String input = "welcome to code decode and code decode welcome you";
       Map<String, Long> wordsCount = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.print(wordsCount);*/

/*8.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 1);
     Map<Integer, Long> countNumbers = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
     List<Integer> uniqueNumbers = countNumbers.entrySet().stream()
             .filter(c -> c.getValue() != 1)
             .map(e -> e.getKey())
             .collect(Collectors.toList());
System.out.print(uniqueNumbers);*/

       /* 3
        String s1 = "RaceCar1";
        String s2 = "CarRace";

        String str1 = Arrays.stream(s1.split("")).map(s -> s.toUpperCase()).sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        String str2 = Arrays.stream(s2.split("")).map(s -> s.toUpperCase()).sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        if(str1.equals(str2)) {
            System.out.print("String is Anagram");
        } else {
            System.out.print("String is not Anagram");
        }*/

        /*7
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<Integer> evenNumbers = myList.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbers);*/

        /*9
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Integer firstWay = myList3.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("firstWay : "+firstWay);

        Integer secondWay = myList3.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        System.out.println("secondWay : "+secondWay);

        Integer thirdWay = myList3.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("thirdWay : "+thirdWay);*/


    }
}
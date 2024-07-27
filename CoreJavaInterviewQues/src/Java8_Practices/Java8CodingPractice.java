package Java8_Practices;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8CodingPractice {

    public static void main(String[] args) {
        /*Map<String, Integer> emap = new HashMap<>();
                    emap.put("Ram", 1000);
                    emap.put("Raju", 2000);
                    emap.put("Ramaan", 3000);
                    emap.put("Shiv", 3000);*/

          /* Map<String, Integer> secondHighestSalary = emap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Integer::intValue).reversed()))
                   .limit(2)
                   .skip(1)
                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("secondHighestSalary ::: "+secondHighestSalary);*/

       /* Integer secondHighestSalary = emap.values().stream().sorted((a,b) -> b - a).distinct().skip(1).findFirst().get();
        Map<String, Integer> secondHighestSalaryMap = emap.entrySet().stream()
                .filter(e->e.getValue() == secondHighestSalary)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("secondHighestSalaryMap ::: "+secondHighestSalaryMap);*/

        /*Employee employee = EmployeeDatabase.getEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Highest Salary of employee ::: "+employee);*/

        String stJitendra = "aaababddd";

        System.out.println("Find second or nth most frequent occurance in word it will give result as LinkedHashMap ");

        Map<String,Long> collect = Arrays.stream(stJitendra.split("")).collect(Collectors.groupingBy(a -> a,Collectors.counting()));
        System.out.println(collect);

        LinkedHashMap<String,Long> map = collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(2)
                                .skip(1)
                                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e2,LinkedHashMap::new));
        System.out.println(map);

        System.out.println("Find second or nth most frequent occurance in word it will give result charact ");

        List<Integer> myList2 = Arrays.asList(10, 15, 8, 10, 25, 15, 32, 15);
     //Find duplicate numbers in list

    }

}

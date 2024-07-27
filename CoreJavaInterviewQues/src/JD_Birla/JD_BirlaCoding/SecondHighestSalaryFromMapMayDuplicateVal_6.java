package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalaryFromMapMayDuplicateVal_6 {

    public static void main(String[] args) {
        Map<String, Integer> emap = new HashMap<>();
        emap.put("Ram", 1000);
        emap.put("Raju", 2000);
        emap.put("Ramaan", 3000);
        emap.put("JD", 3000);

        Integer secondHihestNumber = emap.values().stream().sorted((a,b) -> b - a)
       // Integer secondHihestNumber = emap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .distinct()
                .skip(1)
                .findFirst().get();
              //  .orElse(Integer.MIN_VALUE);

        System.out.println("secondHighestNumber ::: "+secondHihestNumber);

        Map<String, Integer> secondHighestSalary = emap.entrySet().stream()
                .filter(e -> e.getValue() == secondHihestNumber)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println("secondHighestSalary ::: "+secondHighestSalary);


    }

}

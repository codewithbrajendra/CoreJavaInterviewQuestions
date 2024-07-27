package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalaryFromMap_5 {

    public static void main(String[] args) {
        Map<String, Integer> emap = new HashMap<>();
                    emap.put("Ram", 1000);
                    emap.put("Raju", 2000);
                    emap.put("Ramaan", 3000);

        //Get Salary from Map
        Integer salary = emap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .findFirst()
                .get().getValue();

        System.out.println("Second Highest Salary :: "+salary);

        //Get salary from Map with Name
        Map<String, Integer> salaryWithName = emap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Integer::intValue).reversed()))
                .limit(2)
                .skip(1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println("Second Highest Salary with Name:: "+salaryWithName);



    }

}

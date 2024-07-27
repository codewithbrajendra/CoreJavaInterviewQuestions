package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupEmpOnDeptNSortEmpOnAvgSalOfDept_21 {

    public static void main(String[] args) {
        //Given a list of employees and a list of departments, write a Java program to group the employees based on their department and
        //				    then sort the groups of employees based on the average salary of each department in descending order.
        Map<String, Double> collect = EmployeeDatabase.getEmployees()
                .stream().collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
       // collect.forEach((k,v) -> System.out.println(k + " : " +v));
        Stream<Map.Entry<String, Double>> sorted = collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
         sorted.forEach(s -> System.out.println(s.getKey() + " " +s.getValue()));



    }

}

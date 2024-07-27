package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmpOnSalGroupByDept_20 {

    public static void main(String[] args) {
        //Wrtie a program to sort employee based on salary and collect into map by department.

        //Best Solution
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        Map<String, List<Employee>> sortEmps = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(sortEmps);

        Map<String, List<Employee>> collect8 = EmployeeDatabase.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.toList())).entrySet().stream()
                .sorted(Map.Entry.comparingByKey((c1, c2) -> c1.compareTo(c2)))
                .collect(Collectors.toMap(a -> a.getKey(), b -> b.getValue()));
       // System.out.println(collect8);
    }
}

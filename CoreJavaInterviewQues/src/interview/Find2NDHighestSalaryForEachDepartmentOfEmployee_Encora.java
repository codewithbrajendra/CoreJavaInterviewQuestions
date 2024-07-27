package interview;
import java.util.*;
import java.util.stream.Collectors;

public class Find2NDHighestSalaryForEachDepartmentOfEmployee_Encora {

    public static void main(String[] args) {
        Map<String, List<Employee>> emps = EmployeeDatabase.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(emps);
        System.out.println("======================================================");
        emps.forEach((dept,list) -> {
            if(list.size() < 2) {
                System.out.println(dept + " department have less than two employees.");
            } else {
                System.out.println(dept + " department of second highest salary is "+list.get(1).getSalary());
            }
        });

    }

}

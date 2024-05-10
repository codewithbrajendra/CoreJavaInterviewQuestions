package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.stream.Collectors;

public class EmployeeSecondHighestSalary {

    public static void main(String[] args) {
        Employee employee = EmployeeDatabase.getEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElseGet(null);
        System.out.println("Second Highest Salary of Employee ::: "+employee);
    }
}

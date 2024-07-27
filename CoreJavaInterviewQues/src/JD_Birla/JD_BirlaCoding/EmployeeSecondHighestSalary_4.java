package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;

public class EmployeeSecondHighestSalary_4 {

    public static void main(String[] args) {
        Employee employee = EmployeeDatabase.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElseGet(null);
        System.out.println("Second Highest Salary of Employee ::: "+employee);
    }
}

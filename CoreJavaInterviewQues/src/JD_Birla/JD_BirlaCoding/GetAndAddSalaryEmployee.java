package JD_Birla.JD_BirlaCoding;

import java.util.List;
import java.util.stream.Collectors;

public class GetAndAddSalaryEmployee {

    public static void main(String[] args) {
        /*List<Employee> updatedEmplyees = EmployeeDatabase.getEmployees().stream()
                .filter(e -> e.getSalary() < 60000)
                .peek(e -> e.setSalary(e.getSalary() + 2000))
                .collect(Collectors.toList());*/

        List<Employee> updatedEmplyees = EmployeeDatabase.getEmployees().stream()
                .filter(e -> e.getSalary() < 60000)
                        .map(e -> { e.setSalary(e.getSalary() + 3000);
                        return e;}).collect(Collectors.toList());

        System.out.println("Updated Salary :: "+updatedEmplyees);
    }

}

package interview;
import java.util.*;
import java.util.stream.Collectors;
public class FilterEmpIncreasedSalFindMaxSal_EPAM {

    //You are given a list of Employee objects containing employee ID, name, department, and salary. Using Java 8 Stream API:
    //1. Find the names of employees earning more than ₹5,000.
    //2. Give a 10% salary hike to all employees.
    //3. Find the employee with the highest salary after the hike.
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();

        // 1. Find names of employees earning more than 5000
        List<String> empsName = employees.stream()
                .filter(e -> e.getSalary() > 30000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Employees earning > 30000:");
        System.out.println(empsName);

         // 2. Increase salary by 10%
       // Correct formula for a 10% hike
     // New Salary = Old Salary + (Old Salary * 10) /100
   // Or simply:
 // New Salary = Old Salary * 1.10

        employees.forEach(e ->
                e.setSalary(e.getSalary() * 1.10)
        );

        System.out.println("Employees after 10% hike:");
        employees.forEach(System.out::println);

        // 3. Find employee with highest salary
        Employee highSal = employees.stream()
                .max(Comparator.comparingDouble(
                        Employee::getSalary))
                .orElse(null);

        System.out.println("Highest paid employee:");
        System.out.println(highSal);
    }

}

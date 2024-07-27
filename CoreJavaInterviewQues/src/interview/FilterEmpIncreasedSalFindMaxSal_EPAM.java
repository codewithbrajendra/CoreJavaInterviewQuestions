package interview;
import java.util.*;
import java.util.stream.Collectors;
public class FilterEmpIncreasedSalFindMaxSal_EPAM {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getEmployees();

        List<String> empsName = employees.stream()
                .filter(e -> e.getSalary() > 5000).map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(empsName);

        List<Employee> empsHike = employees.stream()
                .map(e -> {
                    e.setSalary((110/e.getSalary())*100);
                    return e;
                }).collect(Collectors.toList());

        System.out.println(empsHike);

        Employee highSal = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst().orElse(null);

        System.out.println(highSal);
    }

}

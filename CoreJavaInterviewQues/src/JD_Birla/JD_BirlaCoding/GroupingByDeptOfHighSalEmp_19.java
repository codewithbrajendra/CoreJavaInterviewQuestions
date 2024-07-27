package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class GroupingByDeptOfHighSalEmp_19 {

    public static void main(String[] args) {
        BinaryOperator<Employee> be = (a,b) -> a.getSalary() > b.getSalary() ? a : b;

        Map<String, Optional<Employee>> emps = EmployeeDatabase.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(be))); //Not Getting Correct Output
       // System.out.println(emps);
//        emps.forEach((k, v) -> System.out
//                .println("BinaryOperator:: Key : " + k + "\t\t" + "Value : " + v.orElseGet(() -> new Employee())));

        Map<String, Employee> collect = EmployeeDatabase.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(Collectors.reducing(be), Optional::get)));
       // System.out.println(collect);

        //Best Solution
        Map<String, Optional<Employee>> collect6 = EmployeeDatabase.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))));
       System.out.println(collect6);

        Map<String, Employee> collect7 = EmployeeDatabase.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(e -> e.getSalary())), Optional::get)));
        //System.out.println(collect7);
    }
}

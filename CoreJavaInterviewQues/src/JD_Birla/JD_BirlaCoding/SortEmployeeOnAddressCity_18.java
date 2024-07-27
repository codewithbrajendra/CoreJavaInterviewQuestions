package JD_Birla.JD_BirlaCoding;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeOnAddressCity_18 {

    public static void main(String[] args) {
        //System.out.println(EmployeeDatabase.getEmployees());
        List<Employee> sortedEmp = EmployeeDatabase.getEmployees().stream()
                .sorted(Comparator.comparing(emp -> emp.getAddress().getCity()))
               // .sorted((e1, e2) -> e1.getAddress().getCity().compareTo(e2.getAddress().getCity()))
                .collect(Collectors.toList());
        System.out.println(sortedEmp);
    }
}

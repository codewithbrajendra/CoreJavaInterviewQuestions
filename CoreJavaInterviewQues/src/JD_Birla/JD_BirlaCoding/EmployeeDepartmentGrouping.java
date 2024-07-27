package JD_Birla.JD_BirlaCoding;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDepartmentGrouping {

    public static void main(String[] args) {
           Map<String, List<Employee>> departmentEmployee = EmployeeDatabase.getEmployees().stream()
                   .collect(Collectors.groupingBy(Employee::getDept));
    }
}

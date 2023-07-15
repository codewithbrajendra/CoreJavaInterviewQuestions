package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitMethod {

    public static void main(String[] args) {
        EmployeeSort employee1 = new EmployeeSort(1,"Ramesh",85000);
        EmployeeSort employee2 = new EmployeeSort(3,"Suresh",95000);
        EmployeeSort employee3 = new EmployeeSort(5,"Preety",100000);
        EmployeeSort employee4 = new EmployeeSort(4,"Sneha",82000);
        EmployeeSort employee5 = new EmployeeSort(2,"Madhav",90000);

        List<EmployeeSort> employeeSorts = Arrays.asList(employee1,employee2,employee3,employee4,employee5);

        System.out.println("Before filter limit ::: "+employeeSorts);
        List<EmployeeSort> limitEmployee = employeeSorts.stream().filter(e -> e.getSalary() > 85000)
                .limit(1).collect(Collectors.toList());

        System.out.println("After filter limit ::: "+limitEmployee);

        //To get 2nd highest salary employee name
        String name = employeeSorts.stream().sorted(
                (e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(2).skip(1).findFirst().get().getEmpName();
        System.out.println("2nd Highest salary employee name ::: "+name);

    }
}

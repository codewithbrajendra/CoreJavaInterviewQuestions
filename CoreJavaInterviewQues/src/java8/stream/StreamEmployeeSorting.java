package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeSorting {

    public static void main(String[] args) {
        EmployeeSort employeeSort1 = new EmployeeSort(1,"Ramesh",85000);
        EmployeeSort employeeSort2 = new EmployeeSort(3,"Suresh",95000);
        EmployeeSort employeeSort3 = new EmployeeSort(5,"Preety",100000);
        EmployeeSort employeeSort4 = new EmployeeSort(4,"Sneha",82000);
        EmployeeSort employeeSort5 = new EmployeeSort(2,"Madhav",90000);

        List<EmployeeSort> employeeSortList = Arrays.asList(employeeSort1,employeeSort2,employeeSort3,
                employeeSort4,employeeSort5);

        System.out.println("Before sorting of employee ::: "+employeeSortList);

        System.out.println("=================Sorting based on empId============================");
        //Employee Id ascending order sorting
        List<EmployeeSort> employeeSortOnIdAsc = employeeSortList.stream()
                .sorted((e1,e2) -> e1.getEmpId() - e2.getEmpId()).collect(Collectors.toList());

        //Employee Id descending order sorting
        List<EmployeeSort> employeeSortOnIdDsc = employeeSortList.stream()
                .sorted((e1,e2) -> e2.getEmpId() - e1.getEmpId()).collect(Collectors.toList());

        //If first object(e1.getEmpId()) subract second object(e2.getEmpId())  then it result will be sorting
        // on ascending order.

        System.out.println("After ascending order sorting based on empId ::: "+employeeSortOnIdAsc);
        System.out.println("After descending order sorting based on empId ::: "+employeeSortOnIdDsc);

        System.out.println("=================Sorting based on empName============================");

        //Employee Name ascending order sorting
        List<EmployeeSort> employeeSortOnNameAsc = employeeSortList.stream().sorted((e1,e2) ->
                e1.getEmpName().compareTo(e2.getEmpName())).collect(Collectors.toList());

        //Employee Name descending order sorting
        List<EmployeeSort> employeeSortOnNameDsc = employeeSortList.stream().sorted((e1,e2) ->
                e2.getEmpName().compareTo(e1.getEmpName())).collect(Collectors.toList());

        //If first object(e1.getEmpName()) call compareTo method with passing argument second
        // object(e2.getEmpName()) then it result will be sorting on ascending order.

        System.out.println("After ascending order sorting based on empName ::: "+employeeSortOnNameAsc);
        System.out.println("After descending order sorting based on empName ::: "+employeeSortOnNameDsc);

        System.out.println("=================Sorting based on employee salary============================");
        //Salary ascending order sorting
        List<EmployeeSort> employeeSortOnSalaryAsc = employeeSortList.stream().sorted(
                (e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary())).collect(Collectors.toList());

        //Salary descending order sorting
        List<EmployeeSort> employeeSortOnSalaryDsc = employeeSortList.stream().sorted(
                (e1,e2) -> Double.compare(e2.getSalary(),e1.getSalary())).collect(Collectors.toList());
       //Note : All wrapper clasess have its own sorting methods compare(datatype,datatype) and compareTo(class).
        //Above example we have Double.compare(double,double) method for sorting.
        System.out.println("After ascending order sorting based on employee salary ::: "+employeeSortOnSalaryAsc);
        System.out.println("After descending order sorting based on employee salary ::: "+employeeSortOnSalaryDsc);
    }
}

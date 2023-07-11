package com.java8logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
	Employee emp1 = new Employee(1, "A", 45000);
	Employee emp2 = new Employee(2, "B", 75000);
	Employee emp3 = new Employee(3, "C", 35000);
	Employee emp4 = new Employee(4, "D", 25000);
	Employee emp5 = new Employee(5, "E", 30000);
	Employee emp6 = new Employee(6, "F", 32000);
	Employee emp7 = new Employee(7, "G", 42000);
	Employee emp8 = new Employee(8, "H", 48000);
	Employee emp9 = new Employee(9, "I", 55000);
	Employee emp10 = new Employee(10, "J", 59000);

	 List<Employee> emps = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
	 System.out.println(emps);
	// List<Employee> filterEmps = emps.stream().filter(e -> e.getEmpSalary() > 50000).collect(Collectors.toList());
	 
	// System.out.println(filterEmps);
	 
	 EmployeeMain employeeMain = new EmployeeMain();
	// List<EmployeeDTO> employeesDTO = filterEmps.stream().map(employeeMain :: convertEmployeeToDTO).collect(Collectors.toList());
//	System.out.println(employeesDTO);
	 
	 List<EmployeeDTO> employeesDTO = emps.stream().filter(e -> e.getEmpSalary() > 50000).map(employeeMain :: convertEmployeeToDTO).collect(Collectors.toList());
		System.out.println(employeesDTO);
	}

	public EmployeeDTO convertEmployeeToDTO(Employee emp) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(emp.getEmpId());
		employeeDTO.setEmpName(emp.getEmpName());
		employeeDTO.setEmpSalary(emp.getEmpSalary());
		return employeeDTO;
	}
	
}

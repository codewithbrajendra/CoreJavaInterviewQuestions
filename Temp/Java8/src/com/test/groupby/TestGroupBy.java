package com.test.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupBy {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Brajendra");
		emp1.setCity(new String("Bhopal"));
		emp1.setAge(32);
		
		Employee emp2 = new Employee();
		emp1.setEmpId(2);
		emp1.setEmpName("Arnav");
		emp1.setCity(new String("Gwalior"));
		emp1.setAge(16);
		
		Employee emp3 = new Employee();
		emp1.setEmpId(3);
		emp1.setEmpName("Diksha");
		emp1.setCity(new String("Jassapur"));
		emp1.setAge(23);
		
		Employee emp4 = new Employee();
		emp1.setEmpId(4);
		emp1.setEmpName("Mona");
		emp1.setCity(new String("Etawa"));
		emp1.setAge(25);
		
		Employee emp5 = new Employee();
		emp1.setEmpId(5);
		emp1.setEmpName("Shikha");
		emp1.setCity(new String("Bhopal"));
		emp1.setAge(26);
		
		List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5);

		Map<String,List<Employee>> ageEmployees = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		
		System.out.println(ageEmployees);
	}

}

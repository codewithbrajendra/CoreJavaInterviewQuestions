package com.test.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentSortingExample {

	
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(23,"Brajendra"));
		students.add(new Student(20,"Santosh"));
		students.add(new Student(17,"Sharik"));
		students.add(new Student(25,"Rajesh"));
		students.add(new Student(19,"Sumit"));
		
		System.out.println("Before Sorting ::: "+students);
		
		List<Student> sortedStudents = students.stream().sorted((Student s1, Student s2)->s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
		
		System.out.println("After Sorting ::: "+sortedStudents);
	}
	
}

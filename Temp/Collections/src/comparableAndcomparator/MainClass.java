package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(23,"Brajendra"));
		students.add(new Student(20,"Santosh"));
		students.add(new Student(17,"Sharik"));
		students.add(new Student(25,"Rajesh"));
		students.add(new Student(19,"Sumit"));
		
		Collections.sort(students);
		
		students.forEach(System.out::println);
	}

}

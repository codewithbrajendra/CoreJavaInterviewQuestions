package concurrentmodifcationexception;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]) {
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add(".Net");
		courses.add("php");
	}
}

package concurrentmodifcationexception;

import java.util.List;

public class MyThread implements Runnable{

	private List<String> courses;
	
	public MyThread(List<String> courses) {
		this.courses = courses;
	}
	
	@Override
	public void run() {

		System.out.println("Before modified course.");
        this.courses.add("python");
        System.out.println("After modified course.");
	}

}

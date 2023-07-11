package comparableAndcomparator;

public class Student implements Comparable<Student>{

	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student student) {
		//This logic for decreasing order
		
		/*if(this.marks > student.marks) {
			return -1;//Current object is greater than parameter object(In case of decreasing order)
		} 
		
		else if(this.marks < student.marks) {
			return 1;//Current object is smaller than parameter object(In case of decreasing order)
		}
		
		return 0;//Current object is equal to parameter object*/
		
//-------------------------------------------------------------------------------------------------
		//This logic for decreasing order
		if(this.marks > student.marks) {
			return 1;//Current object is greater than parameter object(In case of increasing order)
		} 
		
		else if(this.marks < student.marks) {
			return -1;//Current object is smaller than parameter object(In case of increasing order)
		}
		
		return 0;//Current object is equal to parameter object
	
//-------------------------------------------------------------------------------------------------
		
		
		
		
	}
	
	
}

package Practice;

public class CheckConstructorCallingValue {

	int value;
	
	public CheckConstructorCallingValue() {
		value=+1;
	}
	
	public void display() {
		System.out.println("After constructor calling value : "+value);
	}
	
	public static void main(String[] args) {
		CheckConstructorCallingValue obj1 = new CheckConstructorCallingValue();
		CheckConstructorCallingValue obj2 = new CheckConstructorCallingValue();
		obj1.display();
		obj2.display();
	}

}

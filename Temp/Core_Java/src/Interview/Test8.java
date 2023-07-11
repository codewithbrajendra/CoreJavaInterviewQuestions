package Interview;

class Derived1 {
	public void getDetails() {
		System.out.printf("Derived class ");
	}
}

public class Test8 extends Derived1 {
	public void getDetails() {
		System.out.printf("Test class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		Derived1 obj = new Test8();
		obj.getDetails();
	}
}

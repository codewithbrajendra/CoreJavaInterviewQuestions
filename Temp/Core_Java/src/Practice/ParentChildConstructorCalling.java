package Practice;

class A {
	
	private int i = 5;
	public A() {
		System.out.println("Parent x : "+i); 
	}
}

class B extends A{
	
	private int i = 7;
	public B() {
		System.out.println("Child x : "+i);
	}
}

public class ParentChildConstructorCalling {

	public static void main(String[] args) {
		A a = new B();
		//B b = new A(); Type mismatch cannot convert B to A

	}

}

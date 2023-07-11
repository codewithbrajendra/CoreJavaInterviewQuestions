package Practice;

class Parent {
	
	int i = 5;
	
	public void parentMethod() {
		System.out.println("Inside Parent method.");
	}
	
	public void show() {
		System.out.println("Parent show method.");
	}
}

class Child extends Parent {
	
	int i = 7;
	
	public void childMethod() {
		System.out.println("Inside Child method.");
	}
	
	public void show() {
		System.out.println("Child show method.");
	}
}

public class ParentCallingChildMethod {

	public static void main(String[] args) {
		Parent obj = new Child();
		
		//Case 1 :
		
		/*Output :- Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The method childMethod() is undefined for the type Parent*/
		//obj.childMethod();

		//Case 2 :
		
		/*Output :- Exception in thread "main" java.lang.ClassCastException: Practice.Parent cannot be cast to Practice.Child
		at Practice.ParentCallingChildMethod.main(ParentCallingChildMethod.java:25)*/
		/*Child ob = (Child) new Parent();
		System.out.println("Type cast successfully.");*/
		
		//Case 3 :
	   /*Output :- Child show method.
	   Because memory is created of child class that's y child method call.*/
		obj.show();
		
		//Case 4 :
		int i_value = obj.i;
		System.out.println("i value is : "+i_value);
	}

}

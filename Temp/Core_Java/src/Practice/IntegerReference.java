package Practice;

public class IntegerReference {

	public void display(Integer i) {
		System.out.println("Inside dispay Ineteger i : "+i);
	}
	
	public void display(int i) {
		System.out.println("Inside display int1 i : "+i);
	}
	
	public void display1(Object obj) {
		System.out.println("Object obj "+obj);
	}
	
	public void display1(String str) {
		System.out.println("String str "+str);
	}
	public static void main(String[] args) {
		IntegerReference obj = new IntegerReference();
		obj.display(5);
       //obj.display1("abc");
		obj.display1(null);
	}

}

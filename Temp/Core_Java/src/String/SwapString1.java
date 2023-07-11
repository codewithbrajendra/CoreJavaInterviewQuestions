package String;

public class SwapString1 {

	public static void main(String[] args) {

		/*String s1 = "emp1";
		String s2 = "emp2";*/
		
		String s1 = "Hello";
		String s2 = "World";

		System.out.println("Before swaping : s1 - "+s1);
		System.out.println("Before swaping : s2 - "+s2);	
		
		s1 = s1 + s2;
		
		s2 = s1.substring(0,s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		
		System.out.println("After swaping : s1 - "+s1);
		System.out.println("After swaping : s2 - "+s2);
		
	}

}

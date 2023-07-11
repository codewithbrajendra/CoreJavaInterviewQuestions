package Oops.FiveWaysToCreateObject;

/*Theory - Using New Instance : If we know the name of the class & if it has a public default constructor we 
can create an object –Class.forName. We can use it to create the Object of a Class. Class.forName actually
loads the Class in Java but doesn’t create any Object. To Create an Object of the Class you have to use 
the new Instance Method of the Class.*/

//Java program to illustrate creation of Object 
//using new Instance 
public class SecondUsingNewInstance 
{ 
	String name = "GeeksForGeeks Second Example"; 
	public static void main(String[] args) 
	{ 
		try
		{ 
			Class cls = Class.forName("SecondUsingNewInstance"); 
			SecondUsingNewInstance obj = 
					(SecondUsingNewInstance) cls.newInstance(); 
			System.out.println(obj.name); 
		} 
		catch (ClassNotFoundException e) 
		{ 
			e.printStackTrace(); 
		} 
		catch (InstantiationException e) 
		{ 
			e.printStackTrace(); 
		} 
		catch (IllegalAccessException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 

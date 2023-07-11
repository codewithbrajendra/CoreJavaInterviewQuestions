package Oops.FiveWaysToCreateObject;

/*Theory - Using clone() method: Whenever clone() is called on any object, the JVM actually creates a new 
object and copies all content of the previous object into it. Creating an object using the clone method 
does not invoke any constructor.
To use clone() method on an object we need to implement Cloneable and define the clone() method in it.*/

//Java program to illustrate creation of Object 
//using clone() method 
public class ThirdUsingCloneMethod implements Cloneable 
{ 
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{ 
		return super.clone(); 
	} 
	String name = "GeeksForGeeks third using clone method."; 

	public static void main(String[] args) 
	{ 
		ThirdUsingCloneMethod obj1 = new ThirdUsingCloneMethod(); 
		try
		{ 
			ThirdUsingCloneMethod obj2 = (ThirdUsingCloneMethod) obj1.clone(); 
			System.out.println(obj2.name); 
		} 
		catch (CloneNotSupportedException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 


package Oops.FiveWaysToCreateObject;

/*Theory :- Using newInstance() method of Constructor class : This is similar to the newInstance() method of 
a class. There is one newInstance() method in the java.lang.reflect.Constructor class which we can use to 
create objects. It can also call parameterized constructor, and private constructor by using this 
newInstance() method.
Both newInstance() methods are known as reflective ways to create objects. In fact newInstance() method of 
Class internally uses newInstance() method of Constructor class.*/


//Java program to illustrate creation of Object 
//using newInstance() method of Constructor class 
import java.lang.reflect.*; 

public class FifthUsingReflectionConstructor 
{ 
	private String name; 
	FifthUsingReflectionConstructor() 
	{ 
	} 
	public void setName(String name) 
	{ 
		this.name = name; 
	} 
	public static void main(String[] args) 
	{ 
		try
		{ 
			Constructor<FifthUsingReflectionConstructor> constructor 
				= FifthUsingReflectionConstructor.class.getDeclaredConstructor(); 
			FifthUsingReflectionConstructor r = constructor.newInstance(); 
			r.setName("GeeksForGeeks"); 
			System.out.println(r.name); 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 


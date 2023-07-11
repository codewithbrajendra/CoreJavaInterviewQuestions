package Oops.FiveWaysToCreateObject;

//Java program to illustrate Serializing 
//an Object. 
import java.io.*; 

class DeserializationExample implements Serializable 
{ 
	public String name; 
	DeserializationExample(String name) 
	{ 
		this.name = name; 
	} 

	public static void main(String[] args) 
	{ 
		try
		{ 
			DeserializationExample d = 
					new DeserializationExample("GeeksForGeeks using serialization example."); 
			FileOutputStream f = new FileOutputStream("file.txt"); 
			ObjectOutputStream oos = new ObjectOutputStream(f); 
			oos.writeObject(d); 
			System.out.println("completed writing object.");
			oos.close(); 
			f.close(); 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 


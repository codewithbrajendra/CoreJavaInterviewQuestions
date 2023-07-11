package Oops.FiveWaysToCreateObject;

/*Theory - Using deserialization : Whenever we serialize and then deserialize an object, JVM creates a 
separate object. In deserialization, JVM doesn’t use any constructor to create the object.
To deserialize an object we need to implement the Serializable interface in the class.
Note :- Object of DeserializationExample class is serialized using writeObject() method and written to 
file.txt file.
*/

import java.io.*; 
public class FourthUsingDeserialization {

	public static void main(String[] args) {
		try
        { 
            DeserializationExample d; 
            FileInputStream f = new FileInputStream("file.txt"); 
            ObjectInputStream oos = new ObjectInputStream(f); 
            d = (DeserializationExample)oos.readObject(); 
            System.out.println(d.name); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        

	}

}

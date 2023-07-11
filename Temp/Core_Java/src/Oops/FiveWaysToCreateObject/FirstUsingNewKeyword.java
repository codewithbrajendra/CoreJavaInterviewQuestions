package Oops.FiveWaysToCreateObject;

/*Theory - Using new Keyword : Using new keyword is the most basic way to create an object. This is the most 
common way to create an object in java. Almost 99% of objects are created in this way. By using this method
we can call any constructor we want to call (no argument or parameterized constructors).*/

//Java program to illustrate creation of Object 
//using new keyword 
public class FirstUsingNewKeyword  
{ 
 String name = "GeeksForGeeks"; 
 public static void main(String[] args)  
 { 
     // Here we are creating Object of  
     // NewKeywordExample using new keyword 
	 FirstUsingNewKeyword obj = new FirstUsingNewKeyword(); 
     System.out.println(obj.name); 
 } 
} 
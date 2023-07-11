package Oops;


//Java program to illustrate Cloneable interface 
import java.lang.Cloneable; 

//By implementing Cloneable interface 
//we make sure that instances of class A 
//can be cloned. 
class CloneA implements Cloneable 
{ 
 int i; 
 String s; 

 // A class constructor 
 public CloneA(int i,String s) 
 { 
     this.i = i; 
     this.s = s; 
 } 

 // Overriding clone() method 
 // by simply calling Object class 
 // clone() method. 
 @Override
 protected Object clone()  throws CloneNotSupportedException 
 { 
	 System.out.println("Before clone calling;");
     return super.clone(); 
 } 
} 


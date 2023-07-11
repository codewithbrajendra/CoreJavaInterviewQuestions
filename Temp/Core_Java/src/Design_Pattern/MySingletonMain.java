package Design_Pattern;

class MySingletonMain 
{ 
   public static void main(String args[])     
   { 
       MySingleton a = MySingleton.getInstance(); 
       MySingleton b = MySingleton.getInstance(); 
       a.x = a.x + 10; 
       System.out.println("Value of a.x = " + a.x); 
       System.out.println("Value of b.x = " + b.x); 
   }     
   
//   We changed value of a.x, value of b.x also got updated because both ‘a’ and ‘b’ refer to same object, i.e., 
//   they are objects of a singleton class.
} 
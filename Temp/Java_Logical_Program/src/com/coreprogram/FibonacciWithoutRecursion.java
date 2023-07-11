package com.coreprogram;

import java.util.*;  
class FibonacciWithoutRecursion{    
    public static void main(String args[])    
    {      
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Fibonacci count");
    	int countt = sc.nextInt();
        int number1=0, number2=1, number3, i, count=5;      
        //printing 0 and 1  
        System.out.print(number1+" "+number2);  
          
        //0 and 1 is already printed so loop will start with 2  
        for(i=2; i<countt; ++i)      
        {      
            number3 = number1+number2;      
            System.out.print(" "+number3);      
            number1 = number2;      
            number2 = number3;      
        }      
    }  
}  
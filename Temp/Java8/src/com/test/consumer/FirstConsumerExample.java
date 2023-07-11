package com.test.consumer;
import java.util.function.Consumer;

public class FirstConsumerExample {

	public static void main(String[] args) {
	
	  Consumer<String> consumerString = string -> System.out.println(string);
	 // consumerString.accept("Diksha");
	  
      Consumer<String> printUpperCase = (upperCaseString) -> System.out.println(upperCaseString.toUpperCase());
     // printUpperCase.accept("Diksha");
      
      Consumer<String> reverseConsumerString = reverseString -> {
    	StringBuilder sb = new StringBuilder(reverseString);
    	System.out.println(sb.reverse());
      };
      
      consumerString.andThen(printUpperCase).andThen(reverseConsumerString).accept("Diksha");
      
	}

}

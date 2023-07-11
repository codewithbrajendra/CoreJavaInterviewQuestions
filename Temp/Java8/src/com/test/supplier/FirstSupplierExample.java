package com.test.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class FirstSupplierExample {

	public static void main(String[] args) {
		Supplier<String> stringSupplier = () -> {
			return "This is first example of supplier interface.";
		};

		System.out.println(stringSupplier.get());
		
		Supplier<Integer> intSupplier = () -> {
			return new Random().nextInt(100);
		};
		
		System.out.println(intSupplier.get());
	}

	
	
	
}

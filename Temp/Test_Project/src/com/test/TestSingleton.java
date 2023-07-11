package com.test;

public class TestSingleton {

	private static TestSingleton testSingleton = null;
	
	private TestSingleton() {
		
	}
	
	public static TestSingleton getInstance() {
		
		if(testSingleton == null) {
			return  new TestSingleton();
		} else {
			return testSingleton;
		}
		
	}
}

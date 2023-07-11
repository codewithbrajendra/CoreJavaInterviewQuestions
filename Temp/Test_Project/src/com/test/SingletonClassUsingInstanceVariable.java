package com.test;

public class SingletonClassUsingInstanceVariable {

	public static SingletonClassUsingInstanceVariable object;
	
	int i = 0;
	
	private SingletonClassUsingInstanceVariable() {
		i++;
	}
	
	static {
		object = new SingletonClassUsingInstanceVariable();
	}
	
	public  int printValue() {
		System.out.println(i);
		return i;
	}
}

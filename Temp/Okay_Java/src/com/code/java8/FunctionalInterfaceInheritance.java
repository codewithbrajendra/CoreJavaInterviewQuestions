package com.code.java8;

@FunctionalInterface
interface ParentInterface {
	
	public void print();
}

@FunctionalInterface
interface ChildInterface extends ParentInterface{
	
	//public void chidPrint(); //If we extends functional interface to another functional interface then child interface should not be any abstract method.

	default void defaultChildMethod() {
		System.out.println("default method");
	}

	static void staticChildMethod() {
		System.out.println("static method");
	}
}

public class FunctionalInterfaceInheritance implements ChildInterface{

	@Override
	public void print() {
		System.out.println("Print method in parent interface.");
		
	}

}

package com.test;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonStatic object1 = SingletonStatic.object;
		SingletonStatic object2 = SingletonStatic.object;
		SingletonStatic object3 = SingletonStatic.object;
		SingletonStatic object4 = SingletonStatic.object;
		SingletonStatic object5 = SingletonStatic.object;
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		System.out.println(object4);
		System.out.println(object5);
	}

}

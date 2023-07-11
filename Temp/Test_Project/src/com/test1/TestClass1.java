package com.test1;

import static com.test.StringConstants.checkData;

import com.test.SingletonClassUsingInstanceVariable;
public class TestClass1 {

	public static void main(String[] args) {
		SingletonClassUsingInstanceVariable object = SingletonClassUsingInstanceVariable.object;
		System.out.println(object.printValue());

		SingletonClassUsingInstanceVariable object1 = SingletonClassUsingInstanceVariable.object;
		System.out.println(object1.printValue());
	}

}

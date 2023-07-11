package com.test.functioninterface;

import java.util.function.Function;

public class FirstFunctionInterface {
// In this class we will test apply method of Function interface how function interface is work.
	public static void main(String[] args) {
		FirstFunctionInterface object = new FirstFunctionInterface();
		Function<Integer, Boolean> functionAgeCheck = object :: checkAge;
        System.out.println(functionAgeCheck.apply(23));
	}

	public Boolean checkAge(Integer age) {
		if(age > 18) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
}

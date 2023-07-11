package com.test.predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		Predicate2<String> predicate = (s) -> s != null;//Predicate2 is user defined predicate which is similar work to test input value and return boolean value.
        System.out.println(predicate.test("Oks"));
      //  System.out.println(predicate :: test(null));
	}

}

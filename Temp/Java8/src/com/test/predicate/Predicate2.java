package com.test.predicate;

@FunctionalInterface
public interface Predicate2<T> {

	// boolean test();
	boolean test(T t);
}

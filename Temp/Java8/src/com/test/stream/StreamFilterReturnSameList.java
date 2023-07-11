package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterReturnSameList {

	public static void main(String[] args) {
		List<String> testList = Arrays.asList("abc","pqr","xyz");
		System.out.println("Starting list ::: "+testList);
		List<String> filterList = testList.stream().filter(l -> l.equals(l)).collect(Collectors.toList());
	    System.out.println("Filter List ::: "+filterList);
	}

}

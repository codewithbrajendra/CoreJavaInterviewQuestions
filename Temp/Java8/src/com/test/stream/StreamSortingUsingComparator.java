package com.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingUsingComparator {

	public static void main(String[] args) {
	List<String> names = Arrays.asList("Mona","Rakhi","Shikha","Ranu","Diksha");
	System.out.println("Before Sorting ::: "+names);
		//If we compare s1 object to s2 (s1.compareTo(s2)) then it will sorted according to natural sorting order(Ascending order)
	//If we want to sort descending order then compare s2 object to s1 (s1.compareTo(s2)).
	List<String> sortedNames = names.stream()
		.sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
    System.out.println("After Sorting ::: "+sortedNames);
	}

}

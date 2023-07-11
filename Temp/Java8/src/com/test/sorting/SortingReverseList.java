package com.test.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingReverseList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

	//	List<Integer> sortingReverseList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> sortingReverseList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortingReverseList);
		
	}

}

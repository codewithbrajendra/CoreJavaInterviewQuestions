package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("Sunil", 27);
		hs.put("Anil", 29);
		hs.put("Rajesh", 31);
		hs.put("Aditya", 25);
		hs.put("Rahul", 32);

		TestHashMap.printName(hs);
		
	}

	
	public static void printName(HashMap<String,Integer> hs) {
		
		  Set<Entry<String, Integer>> entry =   hs.entrySet();
		  
//		  Set<Entry<String, Integer>> sortedEntry =  entry.stream().sorted(new Comparator<Integer>() { 
//		}).collect(Collectors.toSet());
		  
	//	  System.out.println(sortedEntry);
	}
	
}

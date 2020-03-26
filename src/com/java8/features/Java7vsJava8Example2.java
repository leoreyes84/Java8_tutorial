package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7vsJava8Example2 {

	public static void main(String[] args) {
		
		final List<String> names = Arrays.asList("Sam","Peter","Bill","Sam");
		
		//Java7
		List<String> uniqueValues = new ArrayList<String>(3);
		for (String name : names) {
			if(!uniqueValues.contains(name)) {
				uniqueValues.add(name);
			}
		}
		System.out.println("Unique values java 7: " + uniqueValues);
		
		//Java8
		List<String> uniqueValues1 = names.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Unique values java 8: " + uniqueValues1);

	}

}

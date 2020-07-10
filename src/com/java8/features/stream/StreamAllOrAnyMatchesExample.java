package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAllOrAnyMatchesExample {
	
	static Predicate<String> p1 = fruit -> fruit.length() > 7;

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Pineapple", "papaya");
		System.out.println("Length check all match: "+fruits.stream().allMatch(p1));
		System.out.println("Length check any match: "+fruits.stream().anyMatch(p1));

	}

}

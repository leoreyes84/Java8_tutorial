package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamMapExample {
	

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Pineapple");
		List<Integer> fruitsIntegers = fruits
				.stream()
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println(fruitsIntegers);
		
		fruits
		.stream()
		.map(String::length)
		.collect(Collectors.toList()).forEach(System.out::println);
	}

}

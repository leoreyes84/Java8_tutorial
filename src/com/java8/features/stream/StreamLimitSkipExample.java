package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipExample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "Pineapple", "papaya");
		fruits.stream().limit(2).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int sum = numbers
				.stream()
				.limit(4)
				.reduce(0, (x, y) -> (x + y));
		System.out.println("Sum of limit: " + sum);

		int skip = numbers
				.stream()
				.skip(2)
				.reduce(0, (x, y) -> (x + y));
		System.out.println("Sum of skip: " + skip);

	}

}

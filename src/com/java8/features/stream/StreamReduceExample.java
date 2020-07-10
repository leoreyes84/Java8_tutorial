package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = listOfIntegers.stream().mapToInt(i -> i).sum();
		System.out.println("Result sum: " + sum);
		System.out.println(listOfIntegers.stream().mapToInt(i -> i).count());

		System.out.println("Multiplication: " + listOfIntegers.stream().reduce(1, (a, b) -> a * b));
		// 1*1 = 1
		// 1*2 = 2
		// 2*3 = 6
		// 6*4 = 24
		// 24*5 = 120
		System.out.println("Addition: " + listOfIntegers.stream().reduce(0, (a, b) -> a + b));

	}

}

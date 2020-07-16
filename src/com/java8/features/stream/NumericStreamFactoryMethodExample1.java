package com.java8.features.stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamFactoryMethodExample1 {

	public static void main(String[] args) {
		int sum = IntStream.range(1, 50).sum();
		System.out.println("Sum is: " + sum);
		
		OptionalInt max = IntStream.range(1, 50).max();
		System.out.println("Max is: " + max.getAsInt());

		OptionalLong min = LongStream.range(1, 50).min();
		System.out.println("Min is: " + min.getAsLong());

		OptionalDouble avg = LongStream.range(1, 50).average();
		System.out.println("Avg is: " + avg.getAsDouble());
	}

}

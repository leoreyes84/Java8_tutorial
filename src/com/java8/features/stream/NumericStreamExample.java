package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class NumericStreamExample{
	
	static BinaryOperator<Integer> bo = (x,y) -> x+y;

	static int calculateSum(List<Integer> list) {
		return list.stream().reduce(0, bo);
	}

	static int calculateSumWithStrem(IntStream intStream) {
		return intStream.sum();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Total is: " + calculateSum(list));

		IntStream intStream = IntStream.rangeClosed(1, 6);
		
		System.out.println("Total with stream is: " + calculateSumWithStrem(intStream));
	}

}

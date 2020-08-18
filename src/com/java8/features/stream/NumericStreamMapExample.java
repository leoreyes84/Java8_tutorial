package com.java8.features.stream;

import java.util.stream.IntStream;

public class NumericStreamMapExample {
	
	private static double mapToDouble() {
		return IntStream.rangeClosed(1, 10) // int primitive
				.mapToDouble(x -> x) //convert to dobule
				.sum();
	}
	
	private static long mapToLong() {
		return IntStream.rangeClosed(1, 10) // int primitive
				.mapToLong(x -> x) //convert to dobule
				.sum();
	}
	
	public static void main(String...strings) {
		System.out.println("Map to double: "+mapToDouble());
		System.out.println("Map to long: "+mapToLong());
	}

}

package com.java8.features;

import java.util.stream.IntStream;

public class Java7vsJava8Example1 {

	public static void main(String[] args) {
		// Java7
		int total = 0;
		for(int i = 0; i < 50; i++) {
			total += i;
		}
		System.out.println("Java 7 total: " + total);
		
		//Java8
		int total1 = IntStream.range(0, 50)
					.map(Integer::new)
					.sum();
		System.out.println("Java 8 total: " + total1);

	}

}

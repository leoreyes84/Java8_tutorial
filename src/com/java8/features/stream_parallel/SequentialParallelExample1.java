package com.java8.features.stream_parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialParallelExample1 {

	public static void main(String... strings) {
		System.out.println("Sum from seq: "+checkPerformance(SequentialParallelExample1::sumMethodUsingSeq, 25));
		System.out.println("Sum from parallel: "+checkPerformance(SequentialParallelExample1::sumMethodUsingPararllel, 25));
	}

	static long checkPerformance(Supplier<Integer> sum, int numOfTimes) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < numOfTimes; i++) {
			sum.get();
		}
		long end = System.currentTimeMillis();

		return end - start;
	}

	static int sumMethodUsingSeq() {
		return IntStream.rangeClosed(0, 10000000).sum();
	}

	static int sumMethodUsingPararllel() {
		return IntStream.rangeClosed(0, 10000000).parallel().sum();
	}

}

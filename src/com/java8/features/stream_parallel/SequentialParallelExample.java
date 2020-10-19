package com.java8.features.stream_parallel;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialParallelExample {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		final String[] str = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		System.out.println("--Sequential--");
		printStream(Arrays.stream(str));
		System.out.println("--Parallel--");
		printStream(Arrays.stream(str).parallel());
	}

	static void printStream(final Stream<String> stream) {
		System.out.println("isParallel: "+stream.isParallel());
		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " Value " + s + " - thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}

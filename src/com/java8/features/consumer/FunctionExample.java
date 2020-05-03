package com.java8.features.consumer;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> f1 = name -> name.toUpperCase();
	static Function<String, String> f2 = name -> name.toUpperCase().concat(" features");

	public static void main(String[] args) {
//		System.out.println("Result1: "+f1.apply("java"));
//		System.out.println("Result2: "+f2.apply("java"));
		System.out.println("And then result: "+f1.andThen(f2).apply("java"));
		System.out.println("Compose result: "+f1.compose(f2).apply("java"));
	}

}

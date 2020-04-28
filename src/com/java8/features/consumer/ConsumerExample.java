package com.java8.features.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> con1 = (s) -> System.out.println(s.toUpperCase());
//		con1.accept("JaVa8");
		Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
//		con2.accept("JaVa8");
		con1.andThen(con2).accept("Java8");
		
	}

}

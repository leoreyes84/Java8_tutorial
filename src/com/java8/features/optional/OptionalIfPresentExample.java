package com.java8.features.optional;

import java.util.Optional;

public class OptionalIfPresentExample {

	public static void main(String[] args) {

		Optional<String> opt = Optional.of("java8");
		System.out.println(opt.isPresent() ? opt.get() : "Not found");
		
		opt.ifPresent(s -> System.out.println(s));
	}

}

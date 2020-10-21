package com.java8.features.optional;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String...strings) {
		
		Optional<String> name = Optional.ofNullable(getName("test"));
		System.out.println(name.isPresent() ? name.get() : "Data not found");
	}
	
	private static String getName(String name) {
		return null;
	}

}

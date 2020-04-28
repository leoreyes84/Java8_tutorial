package com.java8.features;

@FunctionalInterface
public interface TestInterface {
	
	public void add();
	
	default String sayHi() {
		return "Hi";
	}
	
	default String sayHello() {
		return "Hello";
	}
	
	static boolean isTrue() {
		return true;
	}
	
	static boolean isFalse() {
		return false;
	}
	
	

}

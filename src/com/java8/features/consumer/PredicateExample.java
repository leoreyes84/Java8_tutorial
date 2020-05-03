package com.java8.features.consumer;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> lessThan = a -> (a <= 50);
		Predicate<Integer> greaterThan = a -> (a >= 100);
		Predicate<Integer> equalsTo = a -> (a == 0);
		
//		boolean result = lessThan.test(55);
//		System.out.println("Result: " + result);
		
		Integer number = 150;
		System.out.println("Less than: "+lessThan.test(number));
		System.out.println("Greather than: "+greaterThan.test(number));
		System.out.println("Equals to: "+equalsTo.test(number));
		
		boolean result = lessThan.and(greaterThan).and(equalsTo).test(number);
		System.out.println("Result 1: "+result);
		
		boolean result2 = lessThan.or(greaterThan).test(number);
		System.out.println("Result 2: "+result2);
		
		boolean result3 = lessThan.or(greaterThan).negate().test(number);
		System.out.println("Result 3: "+result3);

	}

}

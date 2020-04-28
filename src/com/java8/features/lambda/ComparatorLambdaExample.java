package com.java8.features.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		// Java7
		Comparator<Integer> c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				return x.compareTo(y);
			}
		};
		System.out.println("Comparator1: "+c1.compare(15, 25));
		
		// Java8
		Comparator<Integer> c2 = (Integer x, Integer y) -> x.compareTo(y);
		System.out.println("Comparator2: "+c2.compare(15, 25));

		Comparator<Integer> c3 = (x, y) -> x.compareTo(y);
		System.out.println("Comparator3: "+c3.compare(15, 25));
		

	}

}

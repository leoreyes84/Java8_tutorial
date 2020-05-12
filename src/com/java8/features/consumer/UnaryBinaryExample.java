package com.java8.features.consumer;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {

//	static UnaryOperator<String> uo1 = a -> a.toUpperCase();
//	static UnaryOperator<Integer> uo2 = a -> a+10;

//	public static void main(String[] args) {
//		System.out.println("Unary 1: " + uo1.apply("java8"));
//		System.out.println("Unary 2: " + uo2.apply(20));
//	}

	static Comparator<Integer> comp = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {
		BinaryOperator<Integer> bo1 = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : a == b ? 0 : -1);
		BinaryOperator<Integer> bo2 = BinaryOperator.maxBy(comp);
		BinaryOperator<Integer> bo3 = BinaryOperator.minBy(comp);

		System.out.println("Birary Operator MaxBy Result 1: " + bo1.apply(102, 15));
		System.out.println("Birary Operator MaxBy Result 2: " + bo2.apply(102, 15));
		System.out.println("Birary Operator MaxBy Result 3: " + bo3.apply(102, 15));
	}

}

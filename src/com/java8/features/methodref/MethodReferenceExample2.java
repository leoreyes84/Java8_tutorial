package com.java8.features.methodref;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class MethodReferenceExample2 {

	static Consumer<String> print = System.out::println;

	static Function<String, String> f1 = name -> name.toUpperCase();
	static Function<String, String> f2 = String::toUpperCase;

	static Predicate<Person> p1 = per -> per.getHeight() >= 140;
	static Predicate<Person> p2 = MethodReferenceExample2::heightCheck;
	static BiPredicate<Person, Integer> p3 = MethodReferenceExample2::heightCheckWithParam;

	public static void main(String[] args) {
//		System.out.println("Lambda expression result: " + f1.apply("java8"));
//		System.out.println("Method reference result: " + f2.apply("java8"));

		print.accept("Predicate 1 result: " + p1.test(PersonRepository.getPerson()));
		print.accept("Predicate 2 result: " + p2.test(PersonRepository.getPerson()));
		print.accept("Predicate 3 result: " + p3.test(PersonRepository.getPerson(), 140));
	}

	private static boolean heightCheck(Person per) {
		return per.getHeight() >= 140;
	}

	private static boolean heightCheckWithParam(Person per, Integer height) {
		return per.getHeight() >= height;
	}

}

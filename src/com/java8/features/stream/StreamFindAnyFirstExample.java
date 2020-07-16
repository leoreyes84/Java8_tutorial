package com.java8.features.stream;

import java.util.Optional;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamFindAnyFirstExample {

	static Predicate<Person> p1 = per -> per.getHeight() >= 140;
	static Predicate<Person> p2 = per -> per.getGender().equals("Female");

	public static void main(String[] args) {
		System.out.println("Find any: " + findAny().get());
		System.out.println("Find first: " + findFirst().get());
	}

	private static Optional<Person> findAny() {
		return PersonRepository.getAllPersons()
				.stream()
				.filter(p1)
				.findAny();
	}

	private static Optional<Person> findFirst() {
		return PersonRepository.getAllPersons()
				.stream()
				.filter(p2)
				.findAny();
	}

}

package com.java8.features.stream;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamPartitioningExample {

	static Predicate<Person> p1 = per -> per.getHeight() >= 140;

	static void byHeigh() {
		Map<Boolean, List<Person>> data = PersonRepository.getAllPersons().stream().collect(partitioningBy(p1));
		System.out.println("Person map 1: " + data);
	}

	static void byHeighWithMap() {
		Map<Boolean, Map<String, List<String>>> data = PersonRepository.getAllPersons().stream()
				.collect(partitioningBy(p1, Collectors.toMap(Person::getName, Person::getHobbies)));
		System.out.println("Person map 2: " + data);
	}

	public static void main(String[] args) {
//		byHeigh();
		byHeighWithMap();
	}

}

package com.java8.features.stream;

import java.util.Comparator;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamCustomSortExample {

	public static void main(String[] args) {
		System.out.println("Sort by name");
		PersonRepository.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person::getName))
		.forEach(System.out::println);
		
		System.out.println("Sort by name reverse");
		PersonRepository.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person::getName).reversed())
		.forEach(System.out::println);

	}

}

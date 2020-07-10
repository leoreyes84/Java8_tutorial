package com.java8.features.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMinMaxByExample {
	
	static Optional<Person> getTallestPerson(){
		return PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
	}
	
	static Optional<Person> getShortestPerson(){
		return PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));
	}

	public static void main(String[] args) {
		System.out.println("Tallest person: "+getTallestPerson());
		System.out.println("Shortest person: "+getShortestPerson());
	}

}

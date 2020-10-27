package com.java8.features.optional;

import java.util.Optional;

import com.java8.features.repo.Address;
import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class OptionalMapExample {

	public static void main(String[] args) {

		// optionalMapExample();
		optionalFlatMap();

	}

	private static void optionalMapExample() {
		Optional<Person> per = PersonRepository.getPersonOptional();
		per.ifPresent(person -> {
			String name = per.map(Person::getName).orElse("Not found");
			System.out.println("Name: " + name);
		});
	}

	private static void optionalFlatMap() {
		Optional<Person> per = PersonRepository.getPersonOptional().filter(pers -> pers.getHeight() >= 140);
		if (per.isPresent()) {
			Optional<Address> add = per.flatMap(Person::getAddress);
			System.out.println("Address :" + add.get());
		}
	}

}

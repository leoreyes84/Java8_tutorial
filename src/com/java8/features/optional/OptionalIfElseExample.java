package com.java8.features.optional;

import java.util.Optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class OptionalIfElseExample {

	public static void main(String[] args) {
//		Optional<Person> person = PersonRepository.getPersonOptiona();
		Optional<Person> person = Optional.of(new Person());
		orElse(person);
		orElseGet(person);
		orElseThorw(person);

	}

	private static void orElse(Optional<Person> person) {
//		String name = person.isPresent() ? person.get().getName() : "Data not found";
		String name = person.map(Person::getName).orElse("Data not found");
		System.out.println("OrElse person name: " + name);
	}

	private static void orElseGet(Optional<Person> person) {
		String name = person.map(Person::getName).orElseGet(() -> {
			//whatever logic
			System.out.println("...whatever process...");
			return "Data not found";
		});

		System.out.println("OrElseGet person name: " + name);
	}
	
	private static void orElseThorw(Optional<Person> person) {
//		String name = person.isPresent() ? person.get().getName() : "Data not found";
		String name = person.map(Person::getName).orElseThrow(() -> new RuntimeException("Data not found"));
		System.out.println("OrElseThrow person name: " + name);
	}

}

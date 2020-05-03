package com.java8.features.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class ConsumerPredicateExample {

	static Predicate<Person> p1 = p -> p.getHeight() >= 140;
	static Predicate<Person> p2 = p -> p.getGender().equals("Male");
	static BiConsumer<String, List<String>> hobbiesConsummer = (name, hobbies) -> System.out
			.println("name: " + name + " hobbies: " + hobbies);
	static Consumer<Person> personConsummer = per -> {
		if (p1.and(p2).test(per)) {
			hobbiesConsummer.accept(per.getName(), per.getHobbies());
		}
	};

	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPersons();
		personList.forEach(personConsummer);

	}

}

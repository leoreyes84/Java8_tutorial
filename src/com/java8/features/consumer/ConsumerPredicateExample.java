package com.java8.features.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class ConsumerPredicateExample {

	static Predicate<Person> p1 = p -> p.getHeight() >= 140;
	static Predicate<Person> p2 = p -> p.getGender().equals("Male");
	// BiPredicate with the same result
	static BiPredicate<Integer, String> p3 = (height, gender) -> height >= 140 && gender.equals("Male");
	static BiConsumer<String, List<String>> hobbiesConsummer = (name, hobbies) -> System.out
			.println("name: " + name + " hobbies: " + hobbies);
	static Consumer<Person> personConsummer = per -> {
		if (p1.and(p2).test(per)) {
			hobbiesConsummer.accept(per.getName(), per.getHobbies());
		}
	};
	static Consumer<Person> personConsummer2 = per -> {
		if (p3.test(per.getHeight(), per.getGender())) {
			hobbiesConsummer.accept(per.getName(), per.getHobbies());
		}
	};

	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPersons();
		personList.forEach(personConsummer);
		System.out.println("-----------");
		personList.forEach(personConsummer2);

	}

}

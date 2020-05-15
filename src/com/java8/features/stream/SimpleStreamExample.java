package com.java8.features.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class SimpleStreamExample {

	public static void main(String[] args) {
//		Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 6);
//		st.forEach(System.out::println);
		
		Predicate<Person> p1 = per -> per.getHeight() >= 140;
		Predicate<Person> p2 = per -> per.getGender().equals("Male");
		
		Map<String, List<String>> personMap = PersonRepository
				.getAllPersons()
				.stream()
				.filter(p1)
				.filter(p2)
				.collect(Collectors.toMap(Person::getName, Person::getHobbies));
		
		System.out.println("Person map: "+personMap);
		
		System.out.println("======================");
		
		List<String> hobbies = PersonRepository
				.getAllPersons()
				.stream()
				.map(Person::getHobbies)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Hobbies: "+hobbies);
	}

}

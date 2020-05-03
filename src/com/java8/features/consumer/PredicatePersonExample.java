package com.java8.features.consumer;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class PredicatePersonExample {
	
	static Predicate<Person> p1 = p -> p.getHeight() >= 140;
	static Predicate<Person> p2 = p -> p.getGender().equals("Male");

	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPersons();
		
		personList.stream().filter(p -> p1.test(p)).forEach(p -> System.out.println("p1: "+p));
		System.out.println("---------------------");
		
		personList.stream().filter(p -> p1.and(p2).test(p)).forEach(p -> System.out.println("p1 and p2: "+p));
		System.out.println("---------------------");
		
		personList.stream().filter(p -> p1.or(p2).test(p)).forEach(p -> System.out.println("p1 or p2: "+p));
		
//		List<Person> collect = personList.stream().filter(p1).collect(Collectors.toList());
//		
//		collect.forEach(System.out::println);
	}

}

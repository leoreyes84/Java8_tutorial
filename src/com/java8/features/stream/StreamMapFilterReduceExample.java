package com.java8.features.stream;

import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMapFilterReduceExample {
	
	static Predicate<Person> p1 = (per) -> per.getHeight() >= 140;
	static Predicate<Person> p2 = (per) -> per.getGender().equals("Male");

	public static void main(String[] args) {
		Integer kidsCount = PersonRepository.getAllPersons()
		.stream()
		.filter(p1.and(p2))
		.map(Person::getKids)
		.reduce(0,Integer::sum);
		System.out.println("Number of kids: "+kidsCount);
	}

}

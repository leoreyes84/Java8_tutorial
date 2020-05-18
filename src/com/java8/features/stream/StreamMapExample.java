package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMapExample {
	
	static Supplier<List<Person>> sup = () -> PersonRepository.getAllPersons();
	

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Pineapple");
		List<Integer> fruitsIntegers = fruits
				.stream()
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println("Lenght list: "+fruitsIntegers);
		System.out.println("Names to uppercase list: "+toUpperCaseNames(sup.get()));
		System.out.println("Names to uppercase set: "+toUpperCaseNamesSet(sup.get()));
		
//		fruits
//		.stream()
//		.map(String::length)
//		.collect(Collectors.toList()).forEach(System.out::println);
	}
	
	static List<String> toUpperCaseNames(List<Person> listPerson){
		return listPerson
				.stream()
				.map(Person::getName)
				.map(String::toUpperCase)
//				.map(per -> per.getName().toUpperCase())
				.collect(Collectors.toList());
	}

	static Set<String> toUpperCaseNamesSet(List<Person> listPerson){
		return listPerson
				.stream()
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
	}

}

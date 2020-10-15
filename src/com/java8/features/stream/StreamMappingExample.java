package com.java8.features.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.mapping;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamMappingExample {

	static List<String> mappingNamesList() {
		final List<String> names = PersonRepository.getAllPersons()
				.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		
		final List<String> names1 = PersonRepository.getAllPersons()
				.stream()
				.collect(mapping(Person::getName, Collectors.toList()));
		return names1;
	}
	
	static Set<String> mappingNamesSet() {
		final List<String> names = PersonRepository.getAllPersons()
				.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		
		final Set<String> names1 = PersonRepository.getAllPersons()
				.stream()
				.collect(mapping(Person::getName, Collectors.toSet()));
		return names1;
	}
	
	static long countTallestPeople(){
		return PersonRepository.getAllPersons()
				.stream()
				.filter(prs -> prs.getHeight() >= 140)
				.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		System.out.println("------List------");
		mappingNamesList().forEach(System.out::println);
		System.out.println("------Set------");
		mappingNamesSet().forEach(System.out::println);
		System.out.println("------Count tallest------");
		System.out.println(countTallestPeople());
	}

}

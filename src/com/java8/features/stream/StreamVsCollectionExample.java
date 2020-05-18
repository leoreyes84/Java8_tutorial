package com.java8.features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamVsCollectionExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John","Adan","Nancy");
		
//		for (String name : names) {
//			System.out.println(">>> "+name);
//		}
//		
//		Stream stream = names.stream();
//		stream.forEach(name -> System.out.println(">>> "+name));
//		names.sort((x,y)->x.compareTo(y));
		
		List<String> personNames = PersonRepository
				.getAllPersons()
				.stream()
//				.sorted(Comparator.comparing(Person::getName).reversed())
//				.peek(System.out::println)
				.map(Person::getName)
				.peek(System.out::println)
				.collect(Collectors.toList());
		
		System.out.println(personNames);
		
	}

}

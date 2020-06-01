package com.java8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.features.repo.PersonRepository;

public class StreamFilterExample {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Sam", "Anderson", "Peter", "Nancy");
//		Stream<String> updatedList = names.stream().filter(n -> n.length() > 3);
//		updatedList.forEach(System.out::println);
//		names.stream().filter(n -> n.length() > 3).collect(Collectors.toList()).forEach(System.out::println);

		PersonRepository.getAllPersons()
		.stream()
		.filter(per -> per.getHeight() >= 140)//Can improve with predicate
		.filter(per -> per.getGender().equals("Male"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

}

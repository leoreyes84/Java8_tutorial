package com.java8.features.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamGroupingExample {

	static void groupByGender() {
		Map<String, List<Person>> groupedData = PersonRepository.getAllPersons().stream()
				.collect(Collectors.groupingBy(Person::getGender));
//		groupData.entrySet().stream()
//				.forEach(per -> System.out.println("Key:" + per.getKey() + "/ Value:" + per.getValue()));
//		
		Stream.of(groupedData).forEach(System.out::println);
	}

	static void groupByHeigh() {
		Map<String, List<Person>> groupedData = PersonRepository.getAllPersons().stream()
				.collect(Collectors.groupingBy(per -> per.getHeight() >= 140 ? "Heighest" : "Shortest"));

		Stream.of(groupedData).forEach(System.out::println);
	}

	static void twoLevelGroup() {
		Map<String, Map<String, List<Person>>> groupedData = PersonRepository.getAllPersons().stream()
				.collect(Collectors.groupingBy(Person::getGender,
						groupingBy(per -> per.getHeight() >= 140 ? "Heighest" : "Shortest")));
		Stream.of(groupedData).forEach(System.out::println);
	}

	public static void main(String... args) {
//		groupByGender();
//		groupByHeigh();
		twoLevelGroup();
	}

}

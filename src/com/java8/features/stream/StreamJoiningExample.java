package com.java8.features.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamJoiningExample {
	
	private static String joiningNames() {
		return PersonRepository.getAllPersons()
				.stream()
				.map(Person::getName)
//				.collect(Collectors.joining());
//				.collect(Collectors.joining("-"));
				.collect(Collectors.joining("-","[","]"));
				
	}

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		String join = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());
//		System.out.println(join);
		System.out.println("Joining names: "+joiningNames());
	}

}

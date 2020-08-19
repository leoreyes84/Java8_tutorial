package com.java8.features.stream;

import java.util.stream.Collectors;

import com.java8.features.repo.PersonRepository;

public class StreamCountExample {

	private static long countTallestPerson() {
		return PersonRepository.getAllPersons()
				.stream()
				.filter(prs -> prs.getHeight() >= 140)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println("Tallest person: " + countTallestPerson());
	}

}

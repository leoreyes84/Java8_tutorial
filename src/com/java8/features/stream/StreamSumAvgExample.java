package com.java8.features.stream;

import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamSumAvgExample {
	
	static int sumTotalKids() {
		
		return PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.summingInt(Person::getKids));
	}
	
	static double averageHeigh() {
		
		return PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.averagingDouble(Person::getHeight));
	}

	public static void main(String[] args) {
		System.out.println("Total kids: " + sumTotalKids());
		System.out.println("Average heigh: " + averageHeigh());
	}

}

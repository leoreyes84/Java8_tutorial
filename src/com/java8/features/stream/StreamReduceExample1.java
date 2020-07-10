package com.java8.features.stream;

import java.util.Optional;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamReduceExample1 {

	public static void main(String[] args) {
		combineNames();
		System.out.println(getTallestPerson());
	}
	
	private static void combineNames() {
		String reduce = PersonRepository.getAllPersons()
		.stream()
		.map(Person::getName)
		.reduce("", (a,b) -> a.concat(" ").concat(b));
		System.out.println(reduce);
	}
	
	static Optional<Person> getTallestPerson(){
		return PersonRepository.getAllPersons()
		.stream()
		.reduce((x, y) -> x.getHeight() > y.getHeight() ? x : y);
	}

}

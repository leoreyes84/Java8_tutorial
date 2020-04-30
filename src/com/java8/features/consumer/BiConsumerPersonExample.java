package com.java8.features.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class BiConsumerPersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPersonalDetails();
	}
	
	private static void printPersonalDetails() {
		BiConsumer<String, List<String>> personConsummer = (name, hobbies) -> System.out.println("name: "+name+" hobbies: "+hobbies);
		
		List<Person> personList = PersonRepository.getAllPersons();
		personList.forEach(person -> personConsummer.accept(person.getName(), person.getHobbies()));
	}

}

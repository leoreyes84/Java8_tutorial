package com.java8.features.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class ConsumerPersonExample {
	
	static Consumer<Person> c1 = (p) -> System.err.println(p);

	static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());
	
	static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
	
	public static void main(String[] args) {
		
//		c1.accept(PersonRepository.getPerson());
//		c2.accept(PersonRepository.getPerson());
//		c3.accept(PersonRepository.getPerson());
//		System.out.println("---------------------");
//		c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());
		
		printNamesAndHobbies();
		
	}
	
	static void printNamesAndHobbies() {
		List<Person> personList = PersonRepository.getAllPersons();
		personList.forEach(p->System.out.println(p));
		System.out.println("---------------------");
		personList.forEach(System.out::println);
		System.out.println("---------------------");
		personList.forEach(c1);
		
	}

}

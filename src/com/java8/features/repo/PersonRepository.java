package com.java8.features.repo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
	
	public static List<Person> getAllPersons(){
		Person p1 = new Person("Jhon", 165, 2000, "Male", 2, Arrays.asList("Criket", "Swimming"));
		Person p2 = new Person("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music"));
		Person p3 = new Person("Charly", 140, 5700, "Male", 2, Arrays.asList("Criket", "Driving"));
		Person p4 = new Person("Susy", 130, 4900, "Female", 2, Arrays.asList("Criket", "Swimming"));
		Person p5 = new Person("Ana", 125, 9000, "Female", 2, Arrays.asList("Footbol", "Swimming"));
		Person p6 = new Person("Peter", 110, 9500, "Male", 2, Arrays.asList("Criket", "Swimming"));
		Person p7 = new Person("Peter", 165, 1980, "Male", 2, Arrays.asList("Football", "Swimming"));
		
		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
	}
	
	public static Person getPerson() {
		return new Person("Jhon", 165, 2000, "Male", 2, Arrays.asList("Criket", "Swimming"));
	}
	
	public static Optional<Person> getPersonOptiona(){
		return Optional.of(getPerson());
	}

}

package com.java8.features.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {
	
	public static List<Person> getAllPersons(){
		Person p1 = new Person("Jhon", 165, 2000, "Male", 2, Arrays.asList("Criket", "Swimming"));
		Person p2 = new Person("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music"));
		Person p3 = new Person("Jhon", 140, 5700, "Male", 2, Arrays.asList("Criket", "Driving"));
		Person p4 = new Person("Jhon", 130, 4900, "Female", 2, Arrays.asList("Criket", "Swimming"));
		Person p5 = new Person("Jhon", 125, 9000, "Female", 2, Arrays.asList("Footbol", "Swimming"));
		Person p6 = new Person("Jhon", 110, 9500, "Male", 2, Arrays.asList("Criket", "Swimming"));
		
		return Arrays.asList(p1, p2, p3, p4, p5, p6);
	}
	
	public static Person getPerson() {
		return new Person("Jhon", 165, 2000, "Male", 2, Arrays.asList("Criket", "Swimming"));
	}

}

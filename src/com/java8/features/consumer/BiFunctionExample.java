package com.java8.features.consumer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class BiFunctionExample {
	
	static BiFunction<String, String, String> bf1 = (a, b) -> (a+" "+b);
	static Predicate<Person> p1 = p -> p.getHeight() >= 140;
	static Predicate<Person> p2 = p -> p.getGender().equals("Male");
	
	static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> bf2 = (personList, predicate) -> {
		Map<String, Double> map = new HashMap<String, Double>();
		personList.forEach(per -> {
			if(p1.and(predicate).test(per)) {
				map.put(per.getName(), per.getSalary());
			}
		});
		return map;
	};

	public static void main(String[] args) {
//		System.out.println(bf1.apply("Java", "features"));
		
		List<Person> personList = PersonRepository.getAllPersons();
		Map<String, Double> result = bf2.apply(personList, p2);
		System.out.println("Result: "+result);
	}

}

package com.java8.features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class StreamFlatMapExample {
	
	static Supplier<List<Person>> sup = () -> PersonRepository.getAllPersons();
	
// Example 1:
//	public static void main(String[] args) {
//		List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7);
//		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
//		
//		List<List<Integer>> listOfNumbers = Arrays.asList(oddNumbers, evenNumbers);
//		System.out.println("Before flat: "+listOfNumbers);
//		
//		List<Integer> listFlatten = listOfNumbers
//				.stream()
////				.flatMap(list -> list.stream())
//				.flatMap(List :: stream)
//				.collect(Collectors.toList());
//		System.out.println("After flat: "+listFlatten);
//
//	}
	
	//Example 2:
	public static void main(String[] args) {
		System.out.println("Hobbies: "+getHobbies(sup.get()));
	}
	
	static List<String> getHobbies(List<Person> personsList){
		return personsList
				.stream()
				.map(Person::getHobbies)
				.flatMap(List::stream)
				.distinct()//Remove duplications
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

}

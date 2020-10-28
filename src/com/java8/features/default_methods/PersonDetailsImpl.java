package com.java8.features.default_methods;

import java.util.List;

import com.java8.features.repo.Person;

public class PersonDetailsImpl implements PersonDetails {

	@Override
	public double calculateTotalSalary(List<Person> personList) {
		return personList.stream().map(Person::getSalary).reduce(0d, (x, y) -> x + y);
	}

}

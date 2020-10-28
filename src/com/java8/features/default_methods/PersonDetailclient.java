package com.java8.features.default_methods;

import java.util.List;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class PersonDetailclient {

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        PersonDetails details = new PersonDetailsImpl();
        System.out.println("Total salary: "+ details.calculateTotalSalary(personList));
        System.out.println("Total kids count: "+ details.totalKids(personList));
        System.out.println("Names: "+ PersonDetails.personNames(personList));
    }

}

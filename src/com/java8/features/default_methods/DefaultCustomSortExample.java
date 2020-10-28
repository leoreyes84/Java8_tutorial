package com.java8.features.default_methods;

import java.util.Comparator;
import java.util.List;

import com.java8.features.repo.Person;
import com.java8.features.repo.PersonRepository;

public class DefaultCustomSortExample {

    static Comparator<Person> c1 = Comparator.comparing(Person::getName);
    static Comparator<Person> c2 = Comparator.comparing(Person::getHeight);
    static Comparator<Person> c3 = Comparator.comparing(Person::getHeight).reversed();

    public static void main(String[] args) {
        List<Person> listOfPerson = PersonRepository.getAllPersons();
        // orderByName(listOfPerson);
        // orderByHeight(listOfPerson);
        // orderByNameAndHeigh(listOfPerson);
        // System.out.println("--------------");
        // orderByNameAndHeighReversed(listOfPerson);
        // System.out.println("--------------");
        orderByNameAndNull(listOfPerson);
    }

    static void orderByName(List<Person> listOfPerson) {
        listOfPerson.sort(c1);
        listOfPerson.forEach(System.out::println);
    }

    static void orderByHeight(List<Person> listOfPerson) {
        listOfPerson.sort(c2);
        listOfPerson.forEach(System.out::println);
    }

    static void orderByNameAndHeigh(List<Person> listOfPerson) {
        listOfPerson.sort(c1.thenComparing(c2));
        listOfPerson.forEach(System.out::println);
    }

    // See peter's difference
    static void orderByNameAndHeighReversed(List<Person> listOfPerson) {
        listOfPerson.sort(c1.thenComparing(c3));
        listOfPerson.forEach(System.out::println);
    }

    static void orderByNameAndNull(List<Person> listOfPerson) {
        Comparator nullValue = Comparator.nullsLast(c1);//nullsLast
        listOfPerson.sort(nullValue);
        listOfPerson.forEach(System.out::println);
    }

}

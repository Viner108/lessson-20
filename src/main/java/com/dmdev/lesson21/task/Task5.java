package com.dmdev.lesson21.task;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Task5 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Labada", "Mishkina", 25),
                new Person("Coca", "Cola", 33),
                new Person("Myr", "Mur", 45),
                new Person("Enter", "Petrov", 18),
                new Person("Love", "Forever", 56)
                );
        people.stream()
                .filter(person -> person.getFullName().length()<10)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
        Map<Integer, List<String>> map = people.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        Map<Integer, Person> personMap = people.stream()
                .collect(toMap(Person::getAge, Function.identity()));
        System.out.println(map);
    }
}

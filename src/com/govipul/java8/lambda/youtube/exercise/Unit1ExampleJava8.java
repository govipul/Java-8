package com.govipul.java8.lambda.youtube.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExampleJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// step 1: sort list by last name
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// step 2: create a method to print all element of list
		performConditionally(people, p -> true, p -> System.out.println(p));

		// step 3: create a method that print all the person having last name beginning
		// with C
		System.out.println("----------LastName------------");
		performConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println);

		System.out.println("----------FirstName------------");
		performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));

	}

	// Replaced the Condition interface with the JAVA 8 provided interface
	public static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}

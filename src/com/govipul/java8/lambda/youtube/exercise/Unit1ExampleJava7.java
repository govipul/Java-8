package com.govipul.java8.lambda.youtube.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExampleJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// step 1: sort list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		// step 2: create a method to print all element of list
		printPeople(people);
		// step 3: create a method that print all the person having last name beginning
		// with C
		System.out.println("----------------------");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});

	}

	public static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	public static void printPeople(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}

}

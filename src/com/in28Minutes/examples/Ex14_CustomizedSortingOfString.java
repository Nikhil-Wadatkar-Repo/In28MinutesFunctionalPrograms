package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex14_CustomizedSortingOfString {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("ankur", "nikhil", "prachi", "dhanu", "mandu");
		// Sorting naturally
		System.out.println("Sorting naturally");
		strings.stream().sorted().forEach(System.out::println);

		// Sorting reversely
		System.out.println("Sorting reversely");
		strings.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// Sorting customizdely
		System.out.println("Sorting customizdely");
		strings.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
	}
}
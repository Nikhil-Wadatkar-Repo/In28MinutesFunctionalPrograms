package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex13_SortStrings {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("ankur", "nikhil", "prachi", "dhanu", "mandu");
		// print sorted numbers
		System.out.println("Sorted Strings");
		strings.stream().sorted().forEach(System.out::println);
	}
}
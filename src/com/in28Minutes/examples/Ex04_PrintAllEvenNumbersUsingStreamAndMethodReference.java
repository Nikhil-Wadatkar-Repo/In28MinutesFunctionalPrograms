package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex04_PrintAllEvenNumbersUsingStreamAndMethodReference {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);

		// from here we will serially go down ward to get concept
		printAllNumbersRegularly(numbers);
	}

	private static void printAllNumbersRegularly(List<Integer> asList) {
		asList.stream()
				// we will take extra method to check whether its even or odd
				.filter(Ex04_PrintAllEvenNumbersUsingStreamAndMethodReference::isEven).forEach(System.out::print);

	}

	private static boolean isEven(int num) {
		return num % 2 == 0;
	}

}
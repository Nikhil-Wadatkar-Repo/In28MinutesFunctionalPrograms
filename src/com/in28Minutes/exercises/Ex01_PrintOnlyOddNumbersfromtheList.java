package com.in28Minutes.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex01_PrintOnlyOddNumbersfromtheList {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);
		
		//from here we will serially go down ward to get concept
		printAllOddNumbersRegularly(numbers);
	}

	private static void printAllOddNumbersRegularly(List<Integer> asList) {
		asList
		.stream()
		.filter(number->number%2!=0)
		.forEach(System.out::println);

}
	}
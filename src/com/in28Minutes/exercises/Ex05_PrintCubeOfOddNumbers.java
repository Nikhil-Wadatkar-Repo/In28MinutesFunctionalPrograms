package com.in28Minutes.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex05_PrintCubeOfOddNumbers {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		
		//from here we will serially go down ward to get concept
		printAllOddNumbersRegularly(numbers);
	}

	private static void printAllOddNumbersRegularly(List<Integer> asList) {
		asList
		.stream()
		.filter(number->number%2!=0)
		.map(number->number*number*number)
		.forEach(System.out::println);

}
	}
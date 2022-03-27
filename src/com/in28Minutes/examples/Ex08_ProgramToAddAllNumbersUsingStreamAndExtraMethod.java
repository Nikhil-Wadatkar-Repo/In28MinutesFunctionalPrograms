package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex08_ProgramToAddAllNumbersUsingStreamAndExtraMethod {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);

		// from here we will serially go down ward to get concept
		int sum = printAllNumbersRegularly(numbers);
		System.out.println(sum);
	}

	private static int printAllNumbersRegularly(List<Integer> asList) {
		
		return asList.stream().reduce(0, Ex08_ProgramToAddAllNumbersUsingStreamAndExtraMethod::sum);
		
		
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
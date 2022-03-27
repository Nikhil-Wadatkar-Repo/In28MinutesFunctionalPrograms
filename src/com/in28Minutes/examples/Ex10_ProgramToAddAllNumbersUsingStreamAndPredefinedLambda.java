package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex10_ProgramToAddAllNumbersUsingStreamAndPredefinedLambda {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);

		// from here we will serially go down ward to get concept
		int sum = printAllNumbersRegularly(numbers);
		System.out.println(sum);
	}

	
	//we can use predefined method in Integer with method reference
	private static int printAllNumbersRegularly(List<Integer> asList) {
		return asList.stream().reduce(0, Integer::sum);
	}

//	public static int sum(int a, int b) {
//		return a + b;
//	}
}
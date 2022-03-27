package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex01_PrintAllNumbers {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);
		
		//from here we will serially go down ward to get concept
		printAllNumbersRegularly(numbers);
	}

	private static void printAllNumbersRegularly(List<Integer> asList) {
//		enhanced For loop
		for (int num : asList) {
			System.out.println(num);
		}
	}

}
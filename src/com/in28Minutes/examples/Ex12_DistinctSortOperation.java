package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;

public class Ex12_DistinctSortOperation {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);

		// print distinct numbers
		System.out.println("distinct numbers");
		numbers.stream().distinct().forEach(System.out::println);

		// print sorted numbers
		System.out.println("Sorted numbers");
		numbers.stream().sorted().forEach(System.out::println);

		// print distinch sorted numbers
		System.out.println("Sorted  + distinct numbers");
		numbers.stream().distinct().sorted().forEach(System.out::println);
	}
}
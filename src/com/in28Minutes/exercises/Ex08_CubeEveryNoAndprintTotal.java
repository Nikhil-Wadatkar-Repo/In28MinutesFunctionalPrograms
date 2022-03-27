package com.in28Minutes.exercises;

import java.util.Arrays;
import java.util.List;

public class Ex08_CubeEveryNoAndprintTotal {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int sum = 0;

		// using extra method
		sum = numbers.stream().
				// map each number and square it
				map(number->number*number*number).reduce(0, Ex08_CubeEveryNoAndprintTotal::sumAll);
		System.out.println(sum);
		
		// using lambda expression
		sum = numbers.stream().map(number->number*number*number).reduce(0, (aggregate, nextNumber) -> aggregate + nextNumber);
		System.out.println(sum);
		
		//using method reference
		sum = numbers.stream().map(number->number*number*number).reduce(0, Integer::sum);
		System.out.println(sum);
		
	}

	public static int sumAll(int aggregate, int nextNumber) {
		return aggregate + nextNumber;
	}
}
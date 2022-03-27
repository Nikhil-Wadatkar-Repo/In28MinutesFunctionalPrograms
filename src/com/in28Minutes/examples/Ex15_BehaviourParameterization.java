package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex15_BehaviourParameterization {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// do square and collect to list
		// normal way
		List<Integer> squaredNumberNormalWay = numbers.stream().map(num -> num * num).collect(Collectors.toList());
		List<Integer> cubeNumberNormalWay = numbers.stream().map(num -> num * num * num).collect(Collectors.toList());

		// behaviourial parametrization way
		Function<Integer, Integer> addNumber = num -> num + num;

		List<Integer> addedNumber = mapAndFilterList(numbers, addNumber);
		System.out.println(addedNumber);
		List<Integer> squaredNumber = mapAndFilterList(numbers, num -> num * num);
		System.out.println(squaredNumber);
		List<Integer> cubedNumber = mapAndFilterList(numbers, num -> num * num * num);
		System.out.println(cubedNumber);
	}

	private static List<Integer> mapAndFilterList(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}
}
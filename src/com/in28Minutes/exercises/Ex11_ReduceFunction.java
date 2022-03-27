package com.in28Minutes.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Ex11_ReduceFunction {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 52, 12, 59, 8, 6, 85, 65);
		
		BinaryOperator<Integer> sumOperatorOld=new BinaryOperator<Integer>() {
						@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		
		BinaryOperator<Integer> sumOperator = (a,b)->a+b;
		
//		int sum = numbers.stream().reduce(0, sumOperatorOld);
		int sum = numbers.stream().reduce(0, sumOperator);
		System.out.println(sum);

	}
}
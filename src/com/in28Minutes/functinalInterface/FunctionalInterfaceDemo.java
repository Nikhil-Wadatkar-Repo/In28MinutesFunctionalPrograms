package com.in28Minutes.functinalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 21, 25, 46, 89, 100);

		/////////////////////////////Predicate implematation
		Predicate<Integer> oldPredicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
		};
		Predicate<Integer> newPredicate= num -> num % 2 == 0;
		
		
		///////////////////////////Function 
		Function<Integer, Integer> oldSquareFunction=new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}
		};
		Function<Integer, Integer> newSquareFunction= t->t*t;

		/////////////////////////////Consumer
		Consumer<Integer> oldSysoutConsumer=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		Consumer<Integer> newSysoutConsumer=t->System.out.println(t); // System.out::println
		//----------------------------------------------------------------------------------------------------------------
		//version without lambda
		numbers.stream().filter(newPredicate).map(newSquareFunction).forEach(newSysoutConsumer);
		System.out.println("-----");
		
		// final version with lambda expression
		numbers.stream().filter(num -> num % 2 == 0).map(num->num*num).forEach(System.out::println);
	}
}

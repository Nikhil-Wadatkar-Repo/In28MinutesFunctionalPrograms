package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Ex16_SupplierDemo {

	public static void main(String[] args) {
	
		Supplier<Integer> supplier=()->{
			Random random=new Random();
			return random.nextInt(500);
		};
		System.out.println(supplier.get());
	
		UnaryOperator<Integer> operator=x->x*3;
		System.out.println(operator.apply(25));
		
		
//		BiFunction<T, U, R>
		
		//BiFunction
		//BiConsumer
		
	}
}
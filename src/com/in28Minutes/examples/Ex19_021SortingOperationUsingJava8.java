package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex19_021SortingOperationUsingJava8 {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 98, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		//Comparator is interface which has static method comparing and that method accepts a function where function will take some input
		//and returns something
		Comparator<Course> noOfStudentSortingComparator = Comparator.comparing(Course::getNoOfStudents);
		
		//sorting in ascending order based on noOfStudents
		courses.stream().sorted(noOfStudentSortingComparator).forEach(System.out::println);
		//sorting in descending order based on noOfStudents
		courses.stream().sorted(noOfStudentSortingComparator.reversed()).forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------------------------------");
		////////////////////////////////sort based on two thing i.e. noOfStudent and reviewScore
		//// if many courses have  same noOfStudent but different reviewScore.
		//new Course("AWS", "Cloud", 92, 21000),
		//new Course("Docker", "Cloud", 98, 20000)
		
		Comparator<Course> mixComparator=Comparator.comparing(Course::getNoOfStudents).thenComparing(Comparator.comparing(Course::getReviewScore));
		System.out.println(courses.stream().sorted(mixComparator).collect(Collectors.toList()));
		
	}
}
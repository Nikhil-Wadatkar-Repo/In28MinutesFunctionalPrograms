package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex21_FindFirstFindLastMinMaxElement {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 98, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Comparator.comparing(Course::getReviewScore))).forEach(System.out::println);
		System.out.println("----------------------");
		System.out.println("Max: "+courses.stream().max(Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Comparator.comparing(Course::getReviewScore))).get()); // Microservices 96 25000
		System.out.println("Min: "+courses.stream().min(Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Comparator.comparing(Course::getReviewScore))).get()); // Microservices 96 25000
		
		System.out.println("FindFirst > 90 : "+courses.stream().filter(course->course.getNoOfStudents()>91).findFirst().get());
		System.out.println("FindLast > 90 : "+courses.stream().filter(course->course.getNoOfStudents()>90).findAny().get());

		
	}
}
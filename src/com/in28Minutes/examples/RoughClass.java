package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RoughClass {
	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 98, 20000),
				new Course("Kubernetes", "Cloud", 91, 21000));

//		allMatch, anyMatch, noneMatch
//		System.out.println(courses.stream().allMatch(str -> str.getReviewScore() > 80));
//		System.out.println(courses.stream().noneMatch(str -> str.getReviewScore() > 250));
//		System.out.println(courses.stream().anyMatch(str -> str.getReviewScore() ==98));
		
		//natural sorting
//		Comparator<Course> normalSorting = Comparator.comparing(Course::getReviewScore);
//		courses.stream().sorted(normalSorting).forEach(System.out::print);
//		System.out.println("------------------");
//		courses.stream().sorted(normalSorting.reversed()).forEach(System.out::print);
		
//		System.out.println("------------------");
//		courses.stream().sorted(Comparator.comparing(Course::getNoOfStudents).thenComparing(Comparator.comparing(Course::getReviewScore))).forEach(System.out::print);
		
		//sort based on length of string -remained task
		List<String> names = courses.stream().map(course->course.getName()).collect(Collectors.toList());
		names.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);

	}
}

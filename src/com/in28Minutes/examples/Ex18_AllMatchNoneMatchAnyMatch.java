package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Ex18_AllMatchNoneMatchAnyMatch {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 98, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		Predicate<? super Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<? super Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<? super Course> reviewScoreLessThan80Predicate = course -> course.getReviewScore() < 80;

		// check if all are having > 90 review score
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate)); // true
		// check if all are not having < 90 review score
		System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() < 90)); // true
		// check if all are not having < 100 review score
		System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() < 100)); // false
		// check if any one is having 99 review score
		System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() == 99));// true

	}
}
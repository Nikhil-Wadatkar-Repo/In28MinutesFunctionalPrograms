package com.in28Minutes.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10_ListWithAllCourseTitleLength {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");

		System.out.println(courses.stream().map(str->str.length()).collect(Collectors.toList()));

	}
}
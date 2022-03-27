package com.in28Minutes.exercises;

import java.util.Arrays;
import java.util.*;

public class Ex06_PrintAllCoursesWithLength {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		//from here we will serially go down ward to get concept
		printAllCourses(courses);
	}

	private static void printAllCourses(List<String> asList) {
		asList
		.stream()
		.map(str->str+" "+str.length())
		.forEach(System.out::println);

}
	}
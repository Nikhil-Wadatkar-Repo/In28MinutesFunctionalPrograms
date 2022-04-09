package com.in28Minutes.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex19_01SortingOperationUsingCollectionSort {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 98, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		
		Collections.sort(courses, Comparator.comparing(Course::getName));
		System.out.println(courses);
		//Comparator is interface which has static method comparing and that method accepts a function where function will take some input
		//and returns something
		Comparator<Course> noOfStudentSortingComparatorMR = Comparator.comparing(Course::getNoOfStudents);
		Comparator<Course> noOfStudentSortingComparatorLambda = Comparator.comparing(object->object.getNoOfStudents());
		
		//sorting in ascending order based on noOfStudents
		courses.sort(noOfStudentSortingComparatorMR);
		
		//sorting in descending order based on noOfStudents
		courses.sort(noOfStudentSortingComparatorLambda.reversed());
		
		System.out.println("-------------------------------------------------------------------------------------");
		////////////////////////////////sort based on two thing i.e. noOfStudent and reviewScore
		//// if many courses have  same noOfStudent but different reviewScore.
		//new Course("AWS", "Cloud", 92, 21000),
		//new Course("Docker", "Cloud", 98, 20000)
		
		Comparator<Course> bothComparators=Comparator.comparing(Course::getNoOfStudents).thenComparing(Comparator.comparing(Course::getNoOfStudents));
		courses.sort(bothComparators);
//		System.out.println(courses);
		
	}
}
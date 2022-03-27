package com.in28Minutes.examples;

public class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return name + " " + reviewScore + " " + noOfStudents + "\n";
	}

	public static void main(String[] args) {
		String s1="ankur";
		String s2="ankur";
		String s3=new String("ankur");
		
		System.out.println(s1+"   "+s2+"  "+s3);
		s3="hh";
		System.out.println(s1+"   "+s2+"  "+s3);
		
	}

}

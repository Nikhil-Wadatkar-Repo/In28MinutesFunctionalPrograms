package com.in28Minutes.functinalInterface;

public class AnonymousClassExample {
	public static void main(String[] args) {
		
		DisplayName displayName=new DisplayName() {
			
			@Override
			public String displayNameInUpperCase(String name) {
				// TODO Auto-generated method stub
				return name.toUpperCase();
			}
		};
		
		System.out.println(displayName.displayNameInUpperCase("nikhil"));
		
		DisplayName lambda=str->str.toUpperCase();
		System.out.println(lambda.displayNameInUpperCase("dhanu"));
	}
}

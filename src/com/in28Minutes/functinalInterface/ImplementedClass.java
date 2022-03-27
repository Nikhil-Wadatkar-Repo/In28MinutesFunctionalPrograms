package com.in28Minutes.functinalInterface;

public class ImplementedClass implements DisplayName {

	@Override
	public String displayNameInUpperCase(String name) {
		// TODO Auto-generated method stub
		return name.toUpperCase();
	}

	public static void main(String[] args) {
		ImplementedClass obj = new ImplementedClass();
		System.out.println(obj.displayNameInUpperCase("ankur"));
	}
}

package com.novonordisk.domain;

public class Circle {
	public void accept(int n1) {
		System.out.println(" In circle Class area method");
		System.out.println("accept() called");
		System.out.println(n1);
				
		float result = (float) (3.14*n1*n1);
		System.out.println("Area of Circle is " + result);
}
}

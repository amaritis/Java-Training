package com.novonordisk.main;

import com.novonordisk.domain.Circle;

public class CircleMain {
	public static void main(String[] args) {
		System.out.println("Circle area");

		// Declaration
		int n1;

		// Initialization
		n1 = 5;

		// Create object of Circle class and call accept function
		Circle addObject = new Circle();
		addObject.accept(n1);

		System.out.println("area end");
	}
}
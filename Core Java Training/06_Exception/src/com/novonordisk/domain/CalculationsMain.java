package com.novonordisk.domain;

public class CalculationsMain {
public static void main(String[] args) {
	System.out.println("Main start");
	Calculations calculations = new Calculations ();
	
	calculations.accept();
	calculations.calculateResult();
	calculations.display();
	
	System.out.println("Main end");
}
}

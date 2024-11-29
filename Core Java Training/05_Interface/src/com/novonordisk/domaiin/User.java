package com.novonordisk.domaiin;

public class User implements Greet, Display {

	@Override
	public void doGreet() {
		// TODO Auto-generated method stub
		System.out.println("Hello Good Afternoon");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("User class print");
	}
	

}

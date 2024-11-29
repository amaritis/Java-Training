package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.LoginDetails;

public class LoginDetailsMain {
public static void main(String[] args) {
	
	//Declare variables
	String username, password;
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter username");
	username = scanner.next();
	System.out.println("Enter password");
	password = scanner.next();
	
	LoginDetails loginDetails = new LoginDetails();
	boolean result = loginDetails.validate(username, password);
			System.out.println("Result");
	if(result == true)
		System.out.println("Login Succesful");
	else
		System.out.println("Login failed");
			
}
}

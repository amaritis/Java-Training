package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMain {
public static void main(String[] args) {
	int accountnumber;
	String name;
	double balance;
	
	Scanner scanner = new Scanner(System.in);
System.out.println("Enter your account number");
	accountnumber = scanner.nextInt();
	

	System.out.println("Enter your name");
	name = scanner.next();
	
	
	System.out.println("Enter your Salary");
	balance = scanner.nextFloat();
	
	
	Account account = new Account();
	account.display(accountnumber, name, balance);
}

}

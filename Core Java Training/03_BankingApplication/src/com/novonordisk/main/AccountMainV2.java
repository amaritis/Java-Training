package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMainV2 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int accountNumber;
	String name;
	double balance;
	int choice;
	double amount;
	boolean result;
	String continueChoice;
	
	System.out.println("Enter account number");
	accountNumber = scanner.nextInt();
	System.out.println("Enter name");
	name = scanner.next();
	System.out.println("Enter balance");
	balance = scanner.nextDouble();
	
	Account account = new Account(accountNumber, name, balance);
	
	do {
		System.out.println("Menu");
		System.out.println("1. WithDrawal");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("You have selected Withdrawal");
			System.out.println("Enter the Amount to Withdraw");
			amount = scanner.nextDouble();
			result = account.withdraw(amount);
			if (result == true)
				System.out.println("Withdraw Succesful");
			else
				System.out.println("Withdraw Failed");
			break;
		case 2:
			System.out.println("You have selected Deposit");
			System.out.println("Deposit Money into Depositor");
			amount = scanner.nextDouble();
			result = account.deposit(amount);
					if (result == true)
						System.out.println("Deposit Succesful");
					else
						System.out.println("Deposit failed, take back money");
			break;
		case 3:
			System.out.println("you have selected View balance");
			System.out.println("Balance = " + account.getBalance());
			break;
			default:
				System.out.println("Invalid input");
				break;
					}
		System.out.println("Do you want to continue? y || n ");
		continueChoice = scanner.next();
			
}	while(continueChoice.equals("y"));
	System.out.println("Thank you");
}
}
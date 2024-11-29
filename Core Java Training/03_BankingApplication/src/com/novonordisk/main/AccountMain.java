package com.novonordisk.main;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {

		Account account = new Account(1000, "Novo Nordisk", 50000);
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		

		System.out.println("----------------------");

		Account account2 = new Account();

		account2.setAccountNumber(2000);
		account2.setName("Novo Zymes");
		account2.setBalance(60000);

		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
	}
}
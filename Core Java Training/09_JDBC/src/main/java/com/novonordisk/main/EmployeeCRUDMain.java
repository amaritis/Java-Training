package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.EmploeeCRUD;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmploeeCRUD employeeCRUD = new EmploeeCRUD();

		int employeeId;
		String name;
		double salary;
		Scanner scanner = new Scanner(System.in);
		employeeCRUD.getAllEmployess();
		System.out.println("Enter EmployeeID to be deleted");
		employeeId = scanner.nextInt();
		employeeCRUD.deleteEmployee(employeeId);
		System.out.println("-------------------");
		employeeCRUD.getAllEmployess();

	}
}


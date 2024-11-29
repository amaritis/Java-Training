package com.novonordisk.main;

import java.text.Format;
import java.util.Scanner;

import com.novonordisk.domain.CSV;
import com.novonordisk.domain.DocumentFormat;
import com.novonordisk.domain.Excel;
import com.novonordisk.domain.PDF;

public class DocumentFormatMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DocumentFormat documentFormat = null;
		
		int choice;
		System.out.println("Menu");
		System.out.println("1. PDF");
		System.out.println("2. Excel");
		System.out.println("3. CSV");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			documentFormat = new PDF();
			break;
		case 2:
			documentFormat = new Excel();
			break;
		case 3:
			documentFormat = new CSV();
			break;
		default:
			System.out.println("Invalid input");
			break;

		}
		documentFormat.downloadDocument();
	}
}

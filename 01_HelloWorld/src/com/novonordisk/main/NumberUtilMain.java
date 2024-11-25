package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.NumberUtil;

public class NumberUtilMain {
public static void main(String args[])
{
	/*int number;
	System.out.println("Enter the number");
	Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();
	
	NumberUtil numberUtil = new NumberUtil();
	int output = numberUtil.getSquareOfNumber(number);
	System.out.println("Result" + output);*/
	
	int n1;
System.out.println("Enter the number1");
Scanner scanner = new Scanner(System.in);
n1 = scanner.nextInt();

int n2;
System.out.println("Enter the number2");
n2 = scanner.nextInt();

int n3;
System.out.println("Enter the number3");
n3 = scanner.nextInt();

NumberUtil nu = new NumberUtil();
int result = nu.getLargest(n1, n2, n3);
System.out.println("The largest number is" + result);
}

}


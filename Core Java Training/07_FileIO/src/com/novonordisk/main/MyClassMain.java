package com.novonordisk.main;

import com.novonordisk.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		System.out.println(myclass.getData());

		int[] numbers = new int[3];
		numbers[0] = 23;
		numbers[1] = 22;
		numbers[2] = 21;

		myclass.setData(numbers);
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		
		System.out.println("--------------------");
		System.out.println("values from Class");
		for (int i : myclass.getData()) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		System.out.println("Changing Array of Main");
		numbers[1] = 1001;
		System.out.println("--------------------");
		System.out.println("Values from Class");
		for (int i : myclass.getData()) {
			System.out.println(i);
		}
			System.out.println("Values from Main");
			for (int i : numbers) {
				System.out.println(i);
			}
		}

		}


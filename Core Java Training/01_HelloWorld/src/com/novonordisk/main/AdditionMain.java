package com.novonordisk.main;

import com.novonordisk.domain.Addition;

public class AdditionMain {
public static void main(String[] args) {
	System.out.println("AdditionMain start");
	
	//Declaration
	int n1;
	int n2;
	
	//Initialization
	n1 = 10;
	n2 = 20;
	
	//Create object of Addition class and call accept function
	Addition addObject = new Addition();
	addObject.accept(n1,  n2);
	
	System.out.println("AdditionMain end");
	
}
}

package com.novonordisk.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsMain {
public static void main(String[] args) {
	System.out.println("1. Array List");
	
	ArrayList<String> names = new ArrayList<String>();
	System.out.println(names.size());
	names.add("Reema");
	names.add("Soma");
	names.add("Rama");
	names.add("AMAR");
	System.out.println(names.size());
	System.out.println(names);
	names.remove("AMAR");
	System.out.println(names);
	System.out.println(names.size());
	
	System.out.println("2. HashSet");
	HashSet<String> nameSet = new HashSet<String>();
	System.out.println(nameSet.size());
	nameSet.add("Reema");
	nameSet.add("Soma");
	nameSet.add("Rama");
	nameSet.add("AMAR");
	System.out.println(nameSet.size());
	System.out.println(nameSet);
	nameSet.remove("AMAR");
	System.out.println(nameSet);
	System.out.println(nameSet.size());
	
	
	System.out.println("3. Tree Set");
	TreeSet<String> nameTreeSet = new TreeSet<String>();
	System.out.println(nameTreeSet.size());
	nameTreeSet.add("Reema");
	nameTreeSet.add("Soma");
	nameTreeSet.add("Rama");
	nameTreeSet.add("AMAR");
	System.out.println(nameTreeSet.size());
	System.out.println(nameTreeSet);
	nameTreeSet.remove("AMAR");
	System.out.println(nameTreeSet);
	System.out.println(nameTreeSet.size());
	
	
	
}
}

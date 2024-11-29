package com.novonordisk.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileMain {
public static void main(String[] args) {
	String path = "c:/FileIO/write.txt";
	File file = new File(path);
	try {
		FileWriter filewriter = new FileWriter(file, true);
		filewriter.write("This is a sample data, update_1 & Update_2");
		filewriter.close();
	} 
	catch (IOException e) 	{
	System.out.println("Failed to locate file OR You do not have permission");
	
}
}
}
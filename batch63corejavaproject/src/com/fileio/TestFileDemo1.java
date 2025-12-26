package com.fileio;

import java.io.File;
import java.io.IOException;


public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !!");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.txt");
		boolean isFileCreated = f.createNewFile();
		
		if (isFileCreated) {
			System.out.println("File has been created Successfully");
		} else {
			System.out.println("Something went wrong !!");
		}
		
		System.out.println("main method ended !!");
	}
}

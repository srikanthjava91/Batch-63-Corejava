package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\srknt\\Srikanth Java\\test", "karthik1.txt");

//		System.out.println(f1.delete());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());

		if (!f1.exists()) {
			boolean isFileCreated = f1.createNewFile();
			if (isFileCreated) {
				System.out.println("File has been created Successfully");
			}
		} else {
			System.out.println("File With this name already exists !!");
		}

		System.out.println(f1.getAbsolutePath());// File
		System.out.println(f1.getCanonicalPath());// File

		System.out.println(f1.getAbsoluteFile());// String

		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		
		
		System.out.println("main method ended !!");
	}
}

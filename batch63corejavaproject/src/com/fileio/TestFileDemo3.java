package com.fileio;

import java.io.File;

public class TestFileDemo3 {

	public static void main(String[] args) {
		String s = "Java is simple in Vcube without a doubt when you practice";
		String[] words = s.split(" ");
		for (String word : words) {
			System.out.println(word.length());
		}
		
		System.out.println("*****************************");

		File f = new File("C:\\Users\\srknt\\Srikanth Java");
		int count = 0;

		String[] list = f.list();
		for (String str : list) {
			System.out.println(str);
			count++;
		}

		System.out.println("all files count : " + count);
	}
}

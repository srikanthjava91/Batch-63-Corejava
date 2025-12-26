package com.exceptionhandling;

//WAP to create a file through Java programming using File class..? 
import java.io.File;
import java.io.IOException;

public class TestExDemo12 {

	public static void main(String[] args) throws IOException, ArithmeticException {
		System.out.println("main method started !");
		System.out.println(10 / 0);
		File f = new File("D:\\Users\\srknt\\Srikanth Java\\test\\Hello2.txt");
		f.createNewFile();///Unhandled exception type IOException
		System.out.println("main method ended! !");
		System.out.println("main method ended! !");
		System.out.println("main method ended! !");
		System.out.println("main method ended! !");
	}
}

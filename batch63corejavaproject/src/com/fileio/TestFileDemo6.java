package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo6 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !!");

		char ch[] = { 'A', 'p', 'p' };
		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth2.txt");

		fw.write(100);// d
		fw.write('\n');
		fw.write("Hello");
		fw.write('\n');
		fw.write("Batch63");
		fw.write('\n');
		fw.write('A');
		fw.write(ch);

		fw.flush();

		System.out.println("main method ended !!");

	}

}

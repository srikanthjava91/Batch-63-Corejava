package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo8 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !");

		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth3.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(97);
		bw.newLine();
		bw.write(98);
		bw.newLine();
		bw.write(99);
		bw.newLine();
		bw.write('A');
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("Hi");
		bw.flush();

		System.out.println("main method ended !");
	}
}

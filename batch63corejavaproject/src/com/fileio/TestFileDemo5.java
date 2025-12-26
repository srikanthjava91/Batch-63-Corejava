package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo5 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method strated ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
	}
}

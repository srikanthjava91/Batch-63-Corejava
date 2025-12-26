package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo4 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\srknt\\Srikanth Java\\test\\sri1s");
		System.out.println(f1.mkdir());
		
		File f = new File(f1,"srikanth123.txt");
		f.createNewFile();

	}

}

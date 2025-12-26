package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

class Test {

}

public class TestFileDemo10 {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Hello main method !!");
		PrintWriter pw = new PrintWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth4.txt");

		Test t = new Test();
		pw.print("Hello");
		pw.println("Gooe morning Hava a nice day ");
		pw.println(false);
		pw.println(true);
		pw.println(100);
		pw.println(100);
		pw.println(t);
		pw.println(89767654578985764L);
		pw.println(67.67);
		
		pw.flush();

	}

}

package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo9 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("main methdo strated ");
		FileWriter fw = new FileWriter("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Good morning");
		bw.append("Good day !");
		bw.flush();
		
		bw.close();
		fw.close();

	}

}

package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestExDemo19 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\srknt\\Srikanth Java\\test\\Hello"))) {
			String line = br.readLine();
			System.out.println("File content: " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

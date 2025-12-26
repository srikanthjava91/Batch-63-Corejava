package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//WAP to read the content and show it in console from the text file using FileReader ..? 
public class TestExDemo13 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Hello.txt");

		try {
			FileReader fr = new FileReader(f);///Unhandled exception type FileNotFoundException
			int i = fr.read();// 72

			while (i != -1) {
				System.out.print((char) i);// H
				i = fr.read();
//				Thread.sleep(200);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}
}

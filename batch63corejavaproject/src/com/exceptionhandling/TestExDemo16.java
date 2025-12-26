package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

//Exception propagation : Whenever we us throws for any method, 
//if we call that method from different method,for that method also 
//we must need to use  throws or we can keep try catch.
public class TestExDemo16 {

	void main(String[] args) {
		System.out.println("main method started ");
		try {
			hello();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void hello() throws IOException {
		System.out.println("hello method");
		File f = new File("");
		f.createNewFile();

	}

}

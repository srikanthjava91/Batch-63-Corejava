package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestFileDemo12 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// De-Serialization
		
		//A FileInputStream obtains input bytes from a file in a file system. 
		FileInputStream fis = new FileInputStream("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.ser");
		
		//An ObjectInputStream deserializes primitive data and objects previously written using an ObjectOutputStream.
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//Read an object from the ObjectInputStream. 
		Employee1 emp2 = (Employee1) ois.readObject();
		
		System.out.println(emp2.eid);
		System.out.println(emp2.uname);
		System.out.println(emp2.password);
	}

}

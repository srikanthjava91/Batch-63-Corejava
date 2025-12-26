package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable {

	// InvalidClassException
	private static final long serialVersionUID = -6943449796452681303L;
	int eid = 18;
	String uname = "Virat";
	transient String password = "Virat123";
}

class TestFileDemo11 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method strated !");
		// Serialization
		Employee1 emp1 = new Employee1();

		// writing data to a File
		FileOutputStream fos = new FileOutputStream("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth1.ser");

		// writes primitive data types and graphs of Java objects to an OutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp1);

	}

}

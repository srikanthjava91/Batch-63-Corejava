package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		try {
			// java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
//		- Loading the Driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class has been loaded successfully !");

//		- Establish the connection to DB
			// Unhandled exception type SQLException
			// Attempts to establish a connection to the given database URL.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");

//		- Create a Statement 
//		Creates a Statement object for sending SQL statements to the database.
			Statement stmt = con.createStatement();

//		- Create a ResultSet 
			// Executes the given SQL statement, which returns a single ResultSet object.
			String sql = "select * from mobile";
			ResultSet rs = stmt.executeQuery(sql);

			// Moves the cursor forward one row from its current position.
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println("***************************");
			}
//		- closing the connection 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("main method ended !");
	}

}

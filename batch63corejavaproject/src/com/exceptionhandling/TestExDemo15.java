package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo15 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from mobile");

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println("***************************");
		}
		rs.close();
		stmt.close();
		con.close();
	}
}

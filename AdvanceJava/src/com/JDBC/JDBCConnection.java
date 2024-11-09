package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws Exception {

		// Step 1 - Load Mysql Driver (Class Loader)
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 - Create Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");

		// Step 3 - Create statement object
		Statement stmt = conn.createStatement();

		// Step 4 - Create query
		ResultSet rs = stmt.executeQuery("Select * from employee");

		while (rs.next()) {
			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getString(5));
			System.out.print("\t" + rs.getInt(6));
			System.out.println("\t" + rs.getInt(7));
		}
	}
}
package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");

		Statement stmt = conn.createStatement();
		
int i = stmt.executeUpdate("insert into employee values(7, 'Anil', 'Infotech', 55000,'Bhopal',854796523,null)");

System.out.println(i);
	
	}
}
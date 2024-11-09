package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestUser {

	public static void main(String[] args) throws Exception {
		
		//addUser();
		 //update();
	    //delete();
	    search();

		
		
	}
private static void addUser() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into st_user values(3, 'Yukti','Sen', 'yukti@gmail.com', 'pass465', 'Tonk', '1996-07-14')");
		
		System.out.println("Data Added Successfully :- " + i);

		}
	
private static void update() throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

	Statement stmt = conn.createStatement();

	int i = stmt.executeUpdate("update st_user set Address = 'Jaipur' where id = 3");

	System.out.println("data updated successfully :-  " + i);
}
	
private static void delete() throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

	Statement stmt = conn.createStatement();

	int i = stmt.executeUpdate("delete from st_user where id = 3");

	System.out.println("data deleted successfully " + i);
}
private static void search() throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");

	Statement stmt = conn.createStatement();

	ResultSet rs = stmt.executeQuery("select * from st_user");

	while (rs.next()) {

		System.out.print(rs.getInt(1));
		System.out.print("\t " + rs.getString(2));
		System.out.print("\t " + rs.getString(3));
		System.out.print("\t " + rs.getString(4));
		System.out.print("\t " + rs.getString(5));
		System.out.print("\t " + rs.getString(6));
		System.out.println("\t " + rs.getDate(7));

	}

}
}
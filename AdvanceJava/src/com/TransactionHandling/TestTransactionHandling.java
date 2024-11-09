package com.TransactionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransactionHandling {

	public static void main(String[] args) throws Exception {

    Connection conn = null;
    
    try { 
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
    	
		//Step1 
    	conn.setAutoCommit(false);
    	
    	Statement stmt = conn.createStatement();
    	
    	int i = stmt.executeUpdate("insert into st_user values(5, 'Ankit', 'Sharma', 'ankit@gmail.com', 'anky123', 'Gurgaon', '1986-06-21')");
    	
    	i = stmt.executeUpdate("insert into st_user values(5, 'Ankit', 'Sharma', 'ankit@gmail.com', 'anky123', 'Gurgaon', '1986-06-21')");
    	
    	i = stmt.executeUpdate("insert into st_user values(5, 'Ankit', 'Sharma', 'ankit@gmail.com', 'anky123', 'Gurgaon', '1986-06-21')");
    	
    	i = stmt.executeUpdate("insert into st_user values(5, 'Ankit', 'Sharma', 'ankit@gmail.com', 'anky123', 'Gurgaon', '1986-06-21')");
    	
    	conn.commit();
	} catch (Exception e) {
		conn.rollback();
		
		System.out.println(e.getMessage());
	}
	
	}

}

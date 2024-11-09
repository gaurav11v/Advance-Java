package com.Test;

import java.util.ResourceBundle;

public class TestBundle {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.bundle.system");
		
		System.out.println("Driver = " + rb.getString("driver"));
		System.out.println("Url = " + rb.getString("url"));
		System.out.println("Username = " + rb.getString("username"));
		System.out.println("Password = " + rb.getString("password"));
	}
}

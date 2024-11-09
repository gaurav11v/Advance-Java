package com.Test;

import java.util.ResourceBundle;

public class AppTest {

	public static void main(String[] args) {
			
			ResourceBundle rb = ResourceBundle.getBundle("com.bundle.app");
			
			System.out.println("Greeting = " + rb.getString("greeting"));

}
}
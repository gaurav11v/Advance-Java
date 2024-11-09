package com.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class App_hiTest {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.bundle.app", new Locale("hi"));
		
		System.out.println("Greeting = " + rb.getString("greeting"));

}
}
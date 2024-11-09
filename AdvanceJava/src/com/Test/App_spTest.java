package com.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class App_spTest {

	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("com.bundle.app", new Locale("sp"));

		System.out.println("Greeting = " + rb.getString("greeting"));

	}
}
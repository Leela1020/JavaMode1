package com.java;

public class UserMainCode2 {

	public void validateNumber(String string) {
		if (string.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
			System.out.println("Valid number format");
		else
			System.out.println("Invalid number format");

	}

}
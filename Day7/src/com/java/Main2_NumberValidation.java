package com.java;

import java.util.Scanner;
/*	 
2. Number Validation
Write a program to read a string of 10 digit number , check whether the string contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit.
*/

public class Main2_NumberValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string in given input format:");
		String string = scanner.nextLine();
		UserMainCode2 userMainCode = new UserMainCode2();
		userMainCode.validateNumber(string);
		scanner.close();

	}

}
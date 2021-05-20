package com.java;

import java.util.Scanner;

/*	4.    Fetching Middle Characters from String
Write a program to read a string of even length and to fetch two middle most characters from the input string and return it as string output.
*/
public class Main4_FetchMiddleCharOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = scanner.nextLine();
		UserMainCode4.getMiddleChars(input);
		scanner.close();
	}

}

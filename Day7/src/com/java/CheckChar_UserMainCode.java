package com.java;

/*
 * 	7.Write a program to read a string  and to test whether first and last character are same.
*/
public class CheckChar_UserMainCode {
	static char firstCharOfString;
	static char lastCharOfString;

	public static int checkCharacters(String inputS1) {

		int length = inputS1.length();
		for (int i = 0; i < length; i++) {
			if (i == 0)
				firstCharOfString = inputS1.charAt(i);
			if (i == length - 1)
				lastCharOfString = inputS1.charAt(length - 1);
		}
		return (firstCharOfString == lastCharOfString) ? 1 : -1;
	}

	public static void main(String[] args) {

		int value = CheckChar_UserMainCode.checkCharacters("leela");
		System.out.println((value > 0) ? "valid" : "invalid");

	}
}

package com.main;
import java.util.Scanner;
import com.hcl.Reverse;
/* 9. Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.
 * 
 */
public class ReverseString {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String string1 = sc.nextLine();
			Reverse.modifiedString(string1);
			sc.close();

		}

	}

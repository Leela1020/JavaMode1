package com.main;
import java.util.Scanner;

/*  7. Write a program to find the given string is pangram or not.
 * 
 */
public class PangramOrNot {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String string = sc.nextLine();
			boolean[] alpha = new boolean[26];
			int index = 0;
			int flag = 1;
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
					index = string.charAt(i) - 'A';
				} else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
					index = string.charAt(i) - 'a';
				}
				alpha[index] = true;
			}
			for (int i = 0; i <= 25; i++) {
				if (alpha[i] == false)
					flag = 0;
			}
	
			if (flag == 1)
				System.out.println("The above string is a Pangram.");
			else
				System.out.println("The above string is not a Pangram.");
			sc.close();
		}
	}


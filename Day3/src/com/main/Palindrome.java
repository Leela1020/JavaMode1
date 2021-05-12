package com.main;

import java.util.Scanner;

public class Palindrome {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String string = scanner.nextLine().toLowerCase();
			String revString = "";
			for(int i=string.length()-1;i>=0;i--) {
				revString+=string.charAt(i);
			}
			
			if(string.equals(revString)) {
				System.out.println("It is palindrome");
			}
			else {
				System.out.println("Not a palindrome");
			}
			scanner.close();
		}
	}  

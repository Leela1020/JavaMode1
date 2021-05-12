package com.main;
/*	2.Write a Java method to display the middle character of a string.
 * 
 */
import java.util.Scanner;

public class MiddleCharOfString {

	public static void main(String[] args) {
				System.out.print("Enter a string: ");
				Scanner sc= new Scanner(System.in);
				String string = sc.nextLine();
				System.out.println("The middle character of the string : " + middle(string));
				sc.close();
			}

			public static String middle(String string) {
				int position,len;
				int num = string.length();
				if (num % 2 == 0) {
					position = num / 2 - 1;
					len = 2;
				} else {
					position = num / 2;
					len = 1;
				}
				return string.substring(position, position + len);
			}
}

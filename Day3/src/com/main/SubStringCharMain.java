package com.main;

import java.util.Scanner;

/*
 *  5. Accept a string, and two indices(integers), and print the substring
 * consisting of all characters inclusive range from ..to . Sample Input
 * Helloworld 3 7 Sample Output: Lowo
 * 
 */
public class SubStringCharMain
{

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any String");
			String string =  sc.nextLine();
			System.out.println("Enter the start index : ");
			int startIndex= sc.nextInt();
			System.out.println("Enter the Last index : ");
			int lastIndex= sc.nextInt();
			System.out.println(string.substring(startIndex,lastIndex));
			sc.close();
			
			
		}
	
	
}

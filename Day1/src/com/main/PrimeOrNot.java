/*
 * (5)Java pgm which will take a number variable and check whether it is prime or not
 */
package com.main;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {

		int number, i, count = 0;
		System.out.println("Enter the variable: ");
		 Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
	
		for (i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("The given number is Prime");
		else
			System.out.println("The given number is not Prime");
		

	}

}

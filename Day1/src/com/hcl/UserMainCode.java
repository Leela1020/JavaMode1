package com.hcl;
/* (9) Program to read a number, calculate the sum of squares of even digits (values) present in the given number.  
 * 
 */

public class UserMainCode {
	public static int sumOfSquareEvenDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				sum = sum + (rem * rem);
			}
			number = number / 10;
		}
		return sum;
	}
}

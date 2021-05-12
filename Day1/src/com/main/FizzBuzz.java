/*
 *  	(7). Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz".
 */
package com.main;

public class FizzBuzz {

	public static void main(String[] args) {
		int i;
		int n = 100;
		for (i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println(i + ":fizz");
			}
			if (i % 5 == 0) {
				System.out.println(i + ":buzz");
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + ":fizzbuzz");
			}
		}
	}
}

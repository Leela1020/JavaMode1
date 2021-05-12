package com.main;
import java.util.Scanner;

/* 1.Write a Java method to find the smallest number among three numbers.
 * 
 */
public class SmallestNumber {
	public static void main(String[] args) {
				System.out.println("Enter the First Number: ");
				Scanner scanner = new Scanner(System.in);
				int number1 = scanner.nextInt();
				System.out.println("Enter the Second Number: ");
				int number2 = scanner.nextInt();
				System.out.println("Enter the Third"
						+ " Number: ");
				int number3 = scanner.nextInt();
				if (number1 > number2 && number1 > number3) {
					System.out.println(number1 + " is greater among the three given numbers");
				} else if (number2 > number3) {
					System.out.println(number2 + " is greater among the three given numbers");
				} else {
					System.out.println(number3 + " is greater among the three given numbers");
				}
				scanner.close();
			}
	}


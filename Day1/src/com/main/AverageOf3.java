package com.main;
import java.util.Scanner;
public class AverageOf3 {

	/*	(3) Java program that takes three numbers as input to calculate and print the average of the numbers
	 * 
	 */
	public static void main(String[] args) {
			int number1, number2, number3;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the three numbers");
			number1 = scanner.nextInt();
			number2 = scanner.nextInt();
			number3 = scanner.nextInt();

			System.out.println("The Average of three numbers is: " + (number1 + number2 + number3) / 3);
			scanner.close();
			scanner = null;
		}
	}


package com.main;

/**
 * @author Leela
 *
 */
import java.util.Scanner;

public class DivisionException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the Numbers");
			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();

			System.out.println(number1 / number2);
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
		scanner.close();
	}

}

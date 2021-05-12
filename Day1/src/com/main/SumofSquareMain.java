package com.main;

import java.util.Scanner;

import com.hcl.UserMainCode;

public class SumofSquareMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		System.out.println(UserMainCode.sumOfSquareEvenDigits(number));
		scanner.close();
	}

}

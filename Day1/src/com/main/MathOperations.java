/* 
 * 
 * (2)Java program to print Sum,Subtract,Multiply and Divide and reminder of two numbers
 * 
 */
package com.main;
import java.util.Scanner;

public class MathOperations {
	public static void main(String[] args) {
		int firstNum, secondNum, add, sub, mul;
		float div;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		firstNum = scanner.nextInt();
		secondNum = scanner.nextInt();

		add = firstNum + secondNum;
		sub = firstNum - secondNum;
		mul = firstNum * secondNum;
		div = firstNum / secondNum;

		System.out.println(" Sum: " + add);
		System.out.println(" Difference: " + sub);
		System.out.println(" Multiplication: " + mul);
		System.out.println(" Division: " + div);
		scanner.close();

	}

}

package com.main;

import java.util.Scanner;

/*  (4)Java program to swap two variables
	 * 
    */

	public class Swap2Var {
		public static void main(String[] args) {
			int num1,num2;
			System.out.println("Enter the two numbers");
			Scanner scanner =new Scanner(System.in);
			num1=scanner.nextInt();
			num2=scanner.nextInt();
					System.out.println("Before swapping the numbers are:" +num1+ " " +num2);
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			System.out.println("After swapping the numbers are:" +num1+ " " +num2);
			scanner.close();
			
		}
	}


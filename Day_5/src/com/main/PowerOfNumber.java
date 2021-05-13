package com.main;

import java.util.Scanner;
import Classes.MyCalculator;
import Exceptions.LessThanZeroException;


/**
 * @author Leela
 *
 */
public class PowerOfNumber {

	/**
	 * @param args
	 * @throws LessThanZeroException 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter the Numbers");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			MyCalculator myCalculator = new MyCalculator();
			try {
				System.out.println("Power of Two Numbers : "+myCalculator.Power(num1, num2));
			}catch(LessThanZeroException ltxe) {
				System.err.println(ltxe.getMessage());
			}
			
		
		scanner.close();
	}

}

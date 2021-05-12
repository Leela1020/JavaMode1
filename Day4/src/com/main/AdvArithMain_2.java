package com.main;

import java.util.Scanner;
import com.hcl.AdvArithematic;
import com.hcl.AdvCalc2;

public class AdvArithMain_2 {

		public static void main(String[] args) {
			AdvArithematic advCalc2 = new AdvCalc2();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			int number = scanner.nextInt();
			System.out.println("The Divisor Sum of the Number "+number+" is : "+ advCalc2.divisorSum(number));
	
			scanner.close();
	

		}

	}

	
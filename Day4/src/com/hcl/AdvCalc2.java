package com.hcl;

public class AdvCalc2 implements AdvArithematic {
	
@Override
		public int divisorSum(int number) {
			System.out.println("I implemented : AdvancedArthimetic");
			int sum = 0;
			for (int i = 1; i <= number / 2; i++) {
				if (number % i == 0) {
					sum += i;
				}
			}
			return sum+number;
		}
			
}


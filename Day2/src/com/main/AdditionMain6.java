package com.main;
import com.hcl.Addition;
import java.util.Scanner;
public class AdditionMain6 {
		public static void main(String[] args) {
			Addition addition = new Addition();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the first number : ");
			int num1 = sc.nextInt();
			System.out.print("Enter the second number : ");
			int num2 = sc.nextInt();
			System.out.print("Enter the third number : ");
			int num3 = sc.nextInt();
			System.out.print("Enter the fourth number : ");
			int num4 = sc.nextInt();
			System.out.print("Enter the fifth number : ");
			int num5 = sc.nextInt();
			System.out.print("Enter the sixth number : ");
			int num6 = sc.nextInt();
			System.out.println(num1 + "+" + num2 + "=" + addition.add(num1, num2));
			System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + addition.add(num1, num2, num3));
			System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + addition.add(num1, num2, num3, num4));
			System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "+" + num5 + "="
					+ addition.add(num1, num2, num3, num4, num5));
			System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "+" + num5 + "+" + num6 + "="
					+ addition.add(num1, num2, num3, num4, num5, num6));
			sc.close();
		}

	}


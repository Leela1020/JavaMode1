package com.java;
/*	
Write a program which would accept a string and a character as a delimiter. Apply the below rules
1. Using the delimiter, split the string and store these elements in array.
2. Reverse each element of the string and convert it into lower case.
Include a class UserMainCode with a static method manipulateLiteral which accepts the string and character. The return type is the string array formed.
Create a Class Main which would be used to accept the string and character and call the static method present in UserMainCode.
*/
import java.util.Scanner;
public class StringSplitter {


	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("enter character");
		char ch = sc.next().charAt(0);
		String[] Split1 = str.split("/");
		//for (int i = 0; i < Split1.length; i++) {
			//System.out.println(Split1[i]);
		//}
		//System.out.println("");

		String reverse = new StringBuffer(str).reverse().toString();
		String lower = reverse.toLowerCase();
		String[] Split2 = lower.split("/");

		for (int i = 0; i < Split2.length; i++) {
			System.out.println(Split2[i]);
		}
		sc.close();
	}
	}
	


package com.main;

import java.util.Scanner;

import com.hcl.CheckSumOdd;

public class CheckSumMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		CheckSumOdd checkSumOdd=new CheckSumOdd();
		int res=CheckSumOdd.checkSum(number);
		System.out.println(res);
		sc.close();
	}
}
                                                                    


package com.java;

/*	12.Write a program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”. 
Include a class UserMainCode with a static method ipValidator which accepts a string. The return type (integer) should return 1 if it is a valid IP address else return 2. 
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode. 
Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between 0-255. 
*/
import java.util.Scanner;

public class IP_Address {

	public static int ipValidator(String ip) {
		String[] inputString = ip.split("[.]");
		boolean status = true;
		for (int i = 0; i < inputString.length; i++) {
			if ((Integer.parseInt(inputString[i]) < 0 || Integer.parseInt(inputString[i]) > 255))
				status = false;
		}
		if (status == true)
			return 1;
		else
			return -1;

	}

	public static void main(String[] args) {
		System.out.println("Enter the IP address");
		Scanner scanner = new Scanner(System.in);
		String IPAddress = scanner.nextLine();
		int result = ipValidator(IPAddress);
		if (result == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		scanner.close();

	}
}

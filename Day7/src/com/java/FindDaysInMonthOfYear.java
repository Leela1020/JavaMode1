package com.java;

/*	5.Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), write a program to find out total number of days in the given month for the given year
 * 
 */
import java.util.Scanner;

public class FindDaysInMonthOfYear {
	public static void main(String[] strings) {
		Scanner scanner = new Scanner(System.in);
		int noOfDaysInMonth = 0;
		String MonthName = "Unknown";
		System.out.print("Give any month number: ");
		int month = scanner.nextInt();
		System.out.print("Input any year: ");
		int year = scanner.nextInt();
		switch (month) {
		case 0:
			MonthName = "January";
			noOfDaysInMonth = 31;
			break;
		case 1:
			MonthName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				noOfDaysInMonth = 29;
			} else {
				noOfDaysInMonth = 28;
			}
			break;
		case 2:
			MonthName = "March";
			noOfDaysInMonth = 31;
			break;
		case 3:
			MonthName = "April";
			noOfDaysInMonth = 30;
			break;
		case 4:
			MonthName = "May";
			noOfDaysInMonth = 31;
			break;
		case 5:
			MonthName = "June";
			noOfDaysInMonth = 30;
			break;
		case 6:
			MonthName = "July";
			noOfDaysInMonth = 31;
			break;
		case 7:
			MonthName = "August";
			noOfDaysInMonth = 31;
			break;
		case 8:
			MonthName = "September";
			noOfDaysInMonth = 30;
			break;
		case 9:
			MonthName = "October";
			noOfDaysInMonth = 31;
			break;
		case 10:
			MonthName = "November";
			noOfDaysInMonth = 30;
			break;
		case 11:
			MonthName = "December";
			noOfDaysInMonth = 31;
		}
		System.out.println(MonthName + " " + year + " has " + noOfDaysInMonth + " days \n");
		scanner.close();
	}
}

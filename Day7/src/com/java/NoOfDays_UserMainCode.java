package com.java;

/*6.Include a class UserMainCode with a static method “getNumberOfDays” that accepts 2 integers as arguments and returns an integer. The first argument corresponds to the year and the second argument corresponds to the month code. The method returns an integer corresponding to the number of days in the month. 
Create a class Main which would get 2 integers as input and call the static method getNumberOfDays present in the UserMainCode. 
*/
import java.time.YearMonth;
import java.util.Scanner;

public class NoOfDays_UserMainCode {
	public static int getNumberOfDays(int month, int year) {
		YearMonth yearMonth = YearMonth.of(year, month + 1);
		return yearMonth.lengthOfMonth();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the month code: ");
		int month = sc.nextInt();
		System.out.println("The number of Days is: " + NoOfDays_UserMainCode.getNumberOfDays(month, year));
		sc.close();

	}

}

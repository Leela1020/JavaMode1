package com.java;

/*	4.Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar 
 * 
 */
import java.util.Calendar;

public class MaxValueOf_YMWd {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date and Time: " + calendar.getTime() + "\n");
		int actualMaxYear = calendar.getActualMaximum(Calendar.YEAR);
		int actualMaxMonth = calendar.getActualMaximum(Calendar.MONTH);
		int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate = calendar.getActualMaximum(Calendar.DATE);
		System.out.println("Maximum Year: \t" + actualMaxYear);
		System.out.println("Maximum Month of Year: \t" + actualMaxMonth);
		System.out.println("Maximum Week of Year: \t" + actualMaxWeek);
		System.out.println("Maximum Date of Year: \t" + actualMaxDate + "\n");

	}
}

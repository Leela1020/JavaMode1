package com.java;

/*	3. Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar 
 * 
 */
import java.util.Calendar;

public class DefaultCalendar {
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println("Display of a default calendar \n");
		System.out.println("Year:\t" + calendar.get(Calendar.YEAR));
		System.out.println("Month:\t" + calendar.get(Calendar.MONTH));
		System.out.println("Day:\t" + calendar.get(Calendar.DATE));
		System.out.println("Hour:\t" + calendar.get(Calendar.HOUR));
		System.out.println("Minute:\t" + calendar.get(Calendar.MINUTE));

	}
}

package com.java;

/*	11.Given a method with two date strings in yyyy-mm-dd format as input. Write code to find the difference between two dates in months.  
 * 
 */
import java.util.*;
import java.text.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiffBtwn2DatesInMonths {
	public static void main(String[] args) throws ParseException, IOException {
		System.out.println("Enter the two dates");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string1 = br.readLine();
		String string2 = br.readLine();

		System.out.println(monthsBetweenDates(string1, string2));
	}

	public static int monthsBetweenDates(String string1, String string2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(string1);
		Date date2 = sdf.parse(string2);
		Calendar cal = Calendar.getInstance();

		cal.setTime(date1);
		int months1 = cal.get(Calendar.MONTH);
		int year1 = cal.get(Calendar.YEAR);
		cal.setTime(date2);
		int months2 = cal.get(Calendar.MONTH);
		int year2 = cal.get(Calendar.YEAR);
		int n = ((year2 - year1) * 12) + (months2 - months1);
		return n;
	}
}
package com.java;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/*	13.Get two date strings as input and write code to find difference between two dates in days. 
Include a class UserMainCode with a static method getDateDifference which accepts two date strings as input. 
The return type of the output is an integer which returns the differenece between two dates in days. 
Create a class Main which would get the input and call the static method getDateDifference present in the UserMainCode.
Sample Input 1: 
2012-03-12 
2012-03-14 
Sample Output 1: 
2 
 
Sample Input 2: 
2012-04-25 
2012-04-28 
Sample Output 2: 
3 
 
*/
public class DiffBtwn2DaysInDates {
	public static int getdateDifference(String input1, String input2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(input1);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		long d1 = c.getTimeInMillis();
		d = sdf.parse(input2);
		c.setTime(d);
		long d2 = c.getTimeInMillis();
		int n = Math.abs((int) ((d1 - d2) / (1000 * 60 * 60 * 24)));
		return n;
	}

	public static void main(String[] args) throws ParseException {
		String input1 = "2012-04-25";
		String input2 = "2012-04-28";
		System.out.println(getdateDifference(input1, input2));
	}
}

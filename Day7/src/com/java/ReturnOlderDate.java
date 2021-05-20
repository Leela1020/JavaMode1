package com.java;

/*	10.Write a program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format
 * 
 */
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReturnOlderDate {
	public static String findOldDate(String date1, String date2) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		Date date3 = null;
		try {
			date = dateFormat.parse(date1);
			date3 = dateFormat.parse(date2);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		if (date.compareTo(date3) > 0) {
			String format = new SimpleDateFormat("MM/dd/yyyy").format(date);
			return format;
		}

		else if (date.compareTo(date3) < 0) {
			String format1 = new SimpleDateFormat("MM/dd/yyyy").format(date);
			return format1;
		}

		else if (date.compareTo(date3) == 0) {
			return "Both are same Dates";
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(ReturnOlderDate.findOldDate("27-04-1998", "13-05-2021"));
	}
}

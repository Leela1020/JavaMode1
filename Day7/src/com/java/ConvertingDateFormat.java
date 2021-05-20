package com.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*	 
14.Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy. 
*/

public class ConvertingDateFormat {
	public static String convertDateFormat(String inputString) {

		DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = df1.parse(inputString);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		inputString = df.format(date);

		return inputString;
	}

	public static void main(String[] args) {
		System.out.println(ConvertingDateFormat.convertDateFormat("14/05/2021"));

	}

}

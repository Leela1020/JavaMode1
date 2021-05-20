package com.java;

/*	2.Write a Java program to extract date, time from the date string 
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateTime_FromString {
	public static void main(String[] args) throws Exception {

		String Date = "27/04/1998	17:30:45";
		Date date = new SimpleDateFormat("dd/MM/yyyy	HH:mm:ss").parse(Date);
		System.out.println("The extracted Date and Time from the given Date String is : \n");
		System.out.println(Date + " " + date);
	}
}

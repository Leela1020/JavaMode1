package com.java;

/*	 1. Write a java program to print current date and time in the specified format. 
 * 
 */

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Date_Time {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("The current Date and Time in the specified format is : ");
		System.out.println(dateTimeFormatter.format(now));
	}
}

package com.java;
/*	
Write a program to read a string array, remove duplicate elements and sort the array.
Note:
1.	    The check for duplicate elements must be case-sensitive. (AA and aa are NOT duplicates)
2.	    While sorting, words starting with upper case letters takes precedence.
Include a class UserMainCode with a static method orderElements which accepts the string array. The return type is the sorted array.
Create a Class Main which would be used to accept the string array and integer and call the static method present in UserMainCode.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SortArrayByRemovingDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n =  scanner .nextInt();
		String[] array1 = new String[n];
		for (int i = 0; i < n; i++) {
			array1[i] =  scanner.next();
		}
		array1 = orderElements(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.println("" + array1[i]);
		}

		 scanner.close();
	}

	public static String[] orderElements(String[] arr) {
		HashSet<String> al = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		Iterator<String> itr = al.iterator();
		arr = new String[al.size()];
		int i = 0;
		while (itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}
		Arrays.sort(arr);
		return arr;
	}

}

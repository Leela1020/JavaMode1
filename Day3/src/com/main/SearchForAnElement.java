package com.main;

/*	4. write a Java program to search for an element of an integer array of 10 elements.
 * 
 */

import java.util.Scanner;

public class SearchForAnElement {
	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of an array");
		m = sc.nextInt();
		int arr[] = new int[m];
		System.out.println("Enter all elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int key;
		System.out.println("Enter key element to search");
		key = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i]) {
				count = 1;
				break;
			}
		}
		if (count == 1) 
			System.out.println("key found");
		else 
			System.out.println("key not found");
		
		sc.close();
	}
}

package com.main;
/*	3. 3. write a Java program to sort an integer array of 10 elements in ascending.
 * 
 */
import java.util.Scanner;
public class SortArrayAsscending {
		public static void main(String[] args) {
			int n;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number of elements in an array");
			n=scanner.nextInt();
			int array[]=new int[n];
			int temp;
			System.out.println("Enter all the elements");
			
			for (int i = 0; i < array.length; i++) {
				array[i]=scanner.nextInt();	
			}
			System.out.println("Before sorting the array elements are:");
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}			
				}			
			}
			System.out.println("After sorting in asscending order, the array elements are :");
			for (int i = 0; i < array.length-1; i++) {
				System.out.println(array[i] + " " );
				
			}
			System.out.println(array[array.length - 1]);	
			scanner.close();
		}
		}

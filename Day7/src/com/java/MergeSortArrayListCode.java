package com.java;

import java.util.ArrayList;
import java.util.Scanner;
/*	8. Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList. 
 * 
 */

public class MergeSortArrayListCode {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the array elements");
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		ArrayList<Integer> array3 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			arraylist1.add(scanner.nextInt());
		for (int j = 0; j < 5; j++)
			arraylist2.add(scanner.nextInt());
		array3 = MergeSortArrayListUserMainCode.sortMergedArrayList(arraylist1, arraylist2);
		for (int n = 0; n < 3; n++)
			System.out.println(array3.get(n));
		scanner.close();
	}
}

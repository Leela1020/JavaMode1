package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortArrayListUserMainCode {

	public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> arraylist1, ArrayList<Integer> arraylist2) {
		arraylist1.addAll(arraylist2);
		Collections.sort(arraylist1);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(arraylist1.get(2));
		result.add(arraylist1.get(6));
		result.add(arraylist1.get(8));
		return result;
	}
}

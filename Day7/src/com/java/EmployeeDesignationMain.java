package com.java;

/*	9. A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. 
 * 
 */

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class EmployeeDesignationMain {

	public static void main(String[] args) {
		System.out.println("Enter the required input");
		Scanner scanner = new Scanner(System.in);
		int k1 = Integer.parseInt(scanner.nextLine());
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		for (int i = 0; i < k1; i++) {
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			lhm.put(a, b);
		}
		String n = scanner.nextLine();
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm = dis(lhm, n);
		Iterator<String> it = hm.keySet().iterator();

		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println(s2);
		}
		scanner.close();

	}

	public static LinkedHashMap<String, String> dis(LinkedHashMap<String, String> h1, String n) {

		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		Iterator<String> it = h1.keySet().iterator();
		while (it.hasNext()) {
			String s2 = it.next();
			String s3 = h1.get(s2);
			if (s3.equals(n))
				hm.put(s2, s3);
		}
		return hm;
	}
}
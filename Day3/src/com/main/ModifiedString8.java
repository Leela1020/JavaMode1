package com.main;
/*	 8. Write a program to read a string and return a modified string.
 * 
 */
import java.util.*;
public class ModifiedString8 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String string = sc.next();
			StringBuffer sb = new StringBuffer();
			if (string.charAt(0) == 'k') {
				if (string.charAt(1) == 'b') {
					sb.append(string);
				} else {
					sb.append(string.charAt(0)).append(string.substring(2));
				}
			} else if (string.charAt(1) == 'b') {
				sb.append(string.charAt(0)).append(string.substring(2));
			} else {
				sb.append(string.substring(2));
			}
			System.out.println(sb);
			sc.close();
		}	
}

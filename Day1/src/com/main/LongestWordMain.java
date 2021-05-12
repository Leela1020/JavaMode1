/*	(10). Java Program which finds the longest word from a sentence. 
 * 
 */

package com.main;
import java.util.Scanner;

import com.hcl.LongestWord;

public class LongestWordMain {

	public static void main(String[] args) {
		LongestWord longestWord = new LongestWord();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();
		System.out.println(longestWord.getLongestWord(sentence));
		scanner.close();

	}

}

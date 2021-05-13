package com.main;
/*  Program to find the Player age is Greater than 19 or or
*   if the age is lessThan 19 it gives Exception of InvalidAgeRange
*/
 
import java.util.Scanner;
import Exceptions.CustomException;

/**
 * @author Leela
 * 
 */

public class PlayerAge {
	
		/**
		 * @param args
		 */
		@SuppressWarnings("resource")
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			try {
			System.out.println("Enter The Player Name :" );
			String playerName = scanner.nextLine();
			System.out.println("Enter The Player Age :" );
			int playerAge = scanner.nextInt();
			if(playerAge< 19) {
				throw new CustomException("InvalidAgeRange");
			}
			
			System.out.println("Enter The Player Name : " + playerName);
			System.out.println("Enter The Player Age : " +playerAge);
			}
			catch(CustomException ce) {
				System.err.println(ce.getMessage());
			}
			scanner.close();
		}
}

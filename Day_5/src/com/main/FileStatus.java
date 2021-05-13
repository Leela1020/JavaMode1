package com.main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatus {
	/**
	 * 
	 * @author Leela
	 * 
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\HCL Training\\sanju java\\java IDE\\Day 5\\info.txt"));
			String line ;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			BufferedReader bufferedReader1 = new BufferedReader(new FileReader("D:\\HCL Training\\sanju java\\java IDE\\Day 5\\info1.txt"));
			String line2 ;
			while((line2 = bufferedReader1.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			bufferedReader1.close();
			
		}
		catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		
	}

}

	

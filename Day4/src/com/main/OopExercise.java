package com.main;
import com.hcl.A;

/**
 * Given Program contains errors
 * System.out.println("in main(): "); 
    System.out.println("objA.a = "+objA.a); to print the a value we have to use objA.getA()
    objA.a = 222; to set the a value we have to use objA.setA(222);
	
	* in below program I fixed the Errors
 */

public class OopExercise {
		public static void main(String[] args) {
			
			
			A objA =new A();
			System.out.println("in main(): "); 
		    System.out.println("objA.a = "+objA.getA()); 
		    objA.setA(222);

			}


		}

package com.main;
import com.hcl.FirstClass;
import com.hcl.SecondClass;


public class OopExercise5 {

		public static void main(String[] args) {
	        FirstClass objA = new FirstClass(); 
	        SecondClass objB = new SecondClass(); 
	        System.out.println("in main(): "); 
	        System.out.println("objA.a = "+objA.getFirstClass()); 
	        System.out.println("objB.b = "+objB.getSecondClass()); 
	        objA.setFirstClass (222); 
	        objB.setSecondClass (333.33); 
	        System.out.println("objA.a = "+objA.getFirstClass()); 
	        System.out.println("objB.b = "+objB.getSecondClass()); 
	    } 


		}



	
	

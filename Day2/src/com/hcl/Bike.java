package com.hcl;

public class Bike extends Cycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	public Bike() {
		System.out.println("Hello I am a motorcycle I am " + define_me());
		String var = define_me1();
		System.out.println("My Ancestor is a cycle who is " + var );
	}
}

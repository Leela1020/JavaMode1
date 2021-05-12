package com.main;
public class InheritanceMain {
	public class ClassA {
		public void display() {
			System.out.println("this is class A");
		}

		public class ClassB extends ClassA {
			public void display2() {
				System.out.println("this is class B which extends class A");
			}

	public void main(String[] args) {
			ClassB classB=new ClassB();
				classB.display();
				classB.display2();		

			}
}	
	}
	}







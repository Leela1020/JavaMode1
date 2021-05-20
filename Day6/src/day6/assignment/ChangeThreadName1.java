package day6.assignment;

/*	 
1. Write a program to assign the current thread to t1. Change the name of the thread to MyThread. Display the changed name of the thread. Also it should display the current time. Put the thread to sleep for 10 seconds and display the time again.
*/

import java.time.LocalTime;

public class ChangeThreadName1 extends Thread {

	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		LocalTime time1 = LocalTime.now();
		System.out.println("After the Sleep Current Time : " + time1);
	}

	public static void main(String[] args) {
		ChangeThreadName1 changeThreadName = new ChangeThreadName1();
		System.out.println("Current Thread Name is : " + changeThreadName.getName());
		changeThreadName.setName("My Thread");

		LocalTime time = LocalTime.now();
		System.out.println("Before the sleep Current Time : " + time);
		changeThreadName.start();
		System.out.println("Newly changed thread Name is : " + changeThreadName.getName());
	}

}

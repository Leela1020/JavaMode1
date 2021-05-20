package day6.assignment;

/* 5 	Write a program to create a class Number  which implements Runnable. Run method displays the multiples of a number accepted as a parameter. In main create three objects - first object should display the multiples of 2, second should display the multiples of 5 and third should display the multiples of 8. Display appropriate message at the beginning and ending of thread. The main thread should wait for the first object to complete. Display the status of threads before the multiples are displayed and after completing the multiples. 
 * 
 */

public class MultsOfNum {

	public static void main(String[] args) {
		Number5 number = new NumberImplementation();
		number.run(2);
		Number5 number1 = new NumberImplementation();
		number1.run(5);
		Number5 number2 = new NumberImplementation();
		number2.run(8);
	}

}

package day6.assignment;

/*  5.Write a program to create a class Number  which implements Runnable. Run method displays the multiples of a number accepted as a parameter. In main create three objects - first object should display the multiples of 2, second should display the multiples of 5 and third should display the multiples of 8. Display appropriate message at the beginning and ending of thread. The main thread should wait for the first object to complete. Display the status of threads before the multiples are displayed and after completing the multiples. 
 * 
 */

public class Number5 implements Runnable {

	public void run(int num) {
		System.out.println("Displaying the multiples of : " + num);
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
		System.out.println("The above are the multiples of " + num);
	}

	public Number5() {
		Thread thread = new Thread();
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

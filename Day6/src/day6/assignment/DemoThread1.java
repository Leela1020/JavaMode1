package day6.assignment;
/*	3 	Write a program to create a class DemoThread1 implementing Runnable interface. In the constructor, create a new thread and start the thread. In run() display a message "running child Thread in loop : " display the value of the counter ranging from 1 to 10. Within the loop put the thread to sleep for 2 seconds. In main create 3 objects of the DemoTread1 and execute the program. 
*/

public class DemoThread1 implements Runnable {

	public void run() {
		System.out.println("running child Thread in loop:");
		int counter = 1;
		while (counter < 11) {
			System.out.println(counter);
			counter = counter + 1;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

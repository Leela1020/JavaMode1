package day6.assignment;

/*	4 	Rewrite the earlier program so that, now the class DemoThread1 instead of implementing from Runnable interface, will now extend from Thread class. 
*
*/
public class DemoThread4 extends Thread {

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

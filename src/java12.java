public class java12 {
	private static Object ball = new Object();// creating shared object that is ball here
        public static void main(String[] args)throws Exception {
		// creating Rohit and Virat threads
		Thread rohit = new Thread(() -> {
			try {
				for (int i = 1; i <= 5; i++) {
					// rohit throws the ball (waits for suchit to catch)
					synchronized (ball) {
						System.out.println("Rohit throws the ball!");
						ball.notify(); // notify Virat to catch
						ball.wait();   // wait for Virat to catch
					}
				}
			} catch (InterruptedException e){}});

		Thread suchit = new Thread(() -> {
			try {
				for (int i = 1; i <= 5; i++) {
					// suchit catches the ball (waits for Rohit to throw)
					synchronized (ball) {
						ball.notify(); // notify Rohit to throw
						System.out.println("suchit drops the catch!");
						ball.wait();   // Wait for Rohit to throw
					}
					// suchit throws the ball back (notifies Rohit)
				}
			} catch (InterruptedException e) {}});
		rohit.start();
		suchit.start();
		rohit.join();//this creates exception that is handled in the main func
		suchit.join();
	}
}//if the program doesnt end press ctrl+z 

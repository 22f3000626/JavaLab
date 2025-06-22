public class java12 {
    private static final Object ball = new Object(); // creating shared object that is ball here
    private static boolean rohitTurn = true; // flag to control whose turn it is
    public static void main(String[] args) throws Exception {
        // creating Rohit and Suchit threads
        Thread rohit = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    synchronized (ball) {
                        // rohit throws the ball only if it's his turn
                        while (!rohitTurn) {
                            ball.wait(); // wait till it's Rohit's turn
                        }
                        System.out.println("Rohit throws the ball!"); // action by rohit
                        rohitTurn = false; // now it's suchit's turn
                        ball.notify(); // notify suchit to catch
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Rohit got interrupted!");
            }
        });
        Thread suchit = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    synchronized (ball) {
                        // suchit waits until it's his turn to catch
                        while (rohitTurn) {
                            ball.wait(); // wait till it's Suchit's turn
                        }
                        System.out.println("Suchit catches and throws it back!"); // action by suchit
                        rohitTurn = true; // now it's rohit's turn again
                        ball.notify(); // notify rohit to catch
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Suchit got interrupted!");
            }
        });
        rohit.start(); // starting the rohit thread
        suchit.start(); // starting the suchit thread
        rohit.join(); // wait for rohit to finish
        suchit.join(); // wait for suchit to finish
    }
}
// if the program doesn't end or gets stuck, press ctrl+z

public class speedtestjava {
    public static void main(String[] args) {
        int x = 0;
        long start = System.nanoTime();

        for (int i = 0; i < 987654321; ++i) {
            x += 1;
        }

        long end = System.nanoTime();
        double elapsed = (end - start) / 1e9; // Convert nanoseconds to seconds
        System.out.println(elapsed);
    }
}


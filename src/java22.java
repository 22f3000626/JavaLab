import java.io.*;

public class java22 {
    public static void main(String args[]) throws IOException {
        byte[] asci = {49,69,56,96};
        ByteArrayInputStream b = new ByteArrayInputStream(asci);
        int k = 0;
        while ((k = b.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value: " + k + "\t" + "character: " + ch);
        }
    }
}


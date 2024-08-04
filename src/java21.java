import java.io.*;

public class java21 {
    public static void main(String args[])throws Exception {
            FileOutputStream fos = new FileOutputStream("mytext1.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("dil ibadat kar raha hai dhakane meri sunn");
            int NoOfBytesWritten = dos.size();
            System.out.println("Number of bytes written: " + NoOfBytesWritten);
	    dos.close();
        }
    }//create a file named mytext1.txt


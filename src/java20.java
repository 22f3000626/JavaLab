import java.io.*;
public class java20{
    public static void main(String[] args) {
    File f = new File("mytext.txt");
    try {
        FileInputStream fin = new FileInputStream(f);
        int ch;
        System.out.println("after 10 bytes: ");
        fin.skip(10);
        while ((ch = fin.read()) != -1)System.out.print((char) ch);
    }
    catch (FileNotFoundException ex) {
    System.out.println("FileNotFoundException"); }
    catch (IOException ioe) {
    System.out.println("IOException");}
    catch (Exception e) {
    System.out.println("Exception");}}}


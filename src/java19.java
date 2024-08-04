 import java.io.*;
 public class java19{
 	public static void main(String[] args) throws IOException,FileNotFoundException {
	InputStreamReader re= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(re);
	System.out.print("enter name: ");
	String name= br.readLine();
	System.out.print("enter age: ");
	int age= Integer.parseInt(br.readLine());
	 BufferedWriter wr = new BufferedWriter(new FileWriter("mytext.txt"));
	 wr.write("java has 4 oop ");
	 wr.newLine();
 	 wr.write("java is statically typed");
	 wr.close();
	 System.out.println("data is written on mytext.txt");
	 BufferedReader r = new BufferedReader(new FileReader("mytext.txt"));
	 String line;
	 while ((line= r.readLine()) != null) {
	 	System.out.println(line);}
	 r.close();
	 System.out.println("the file has been edited by "+name+" of age "+age);
	 }}
	 

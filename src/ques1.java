//polymorphism
//same func name 
import java.io.*;
public class ques1
{
 static int add(int a,int b)
 {
	System.out.println(a+b);
	return 0;
 }
 static float add(float a,float b)
 {
	 System.out.println(a);
	 return 0;
 }
 ques1()
 {
	 System.out.println("hi");
 }
public static void main(String args[])
{
add(4.0f,7.0f);
ques1 obj =new ques1();
}
}

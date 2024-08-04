import java.io.*;
public class java05
{
	public static void main(String args[])throws IOException//using throws to handle IOException by buffered reader
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter x and y values");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		//sc.nextLine() has to be used incase of scanner class to collect \n while pressing enter
		System.out.println("Enter a String:");
		String z=br.readLine();
		try{
		if(x>100 || y>100)
		{
			throw new ArithmeticException();//purposefully throwing an exception
		}
	        try
		{	
		System.out.println(x/y);
		}
		catch (ArithmeticException e)
		{
		System.out.println("arithmetic exception has been handled");
		}
			catch (Exception e1)
			{
				System.out.println("arithmetic exception has been handled");
			}

		finally{
			System.out.println("finally is executing after try catch");
		}}
		catch(ArithmeticException ee)
		{
			System.out.println("enter below 100");//catching that thrown exception 
		}
		
		
}
}
	





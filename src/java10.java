class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread 1");
		for(int i=0;i<=5;i++)
			System.out.println(i);
	}}
class Thread2 implements Runnable//using Runnable Interface
{
	public void run()
	{
		System.out.println("Thread 2");
		for(int i=8;i<=15;i++)
                        System.out.println(i);
	}}
public class java10
{
	public static void main (String args[])throws Exception{ 
	       	Thread1 t1=new Thread1();
		Thread2 obj=new Thread2();//create object of class
		Thread t2=new Thread(obj);//create thread using that object
					  //
		Thread t3=new Thread(new Runnable()
				{
					public void run(){
						System.out.println("Thread 3");
					for(int i=33;i<=40;i++)
						System.out.println(i);
				}});
		Thread t4=new Thread(()->{ System.out.println("Thread 4");
                                           for(int i=55;i<=60;i++)
                                                System.out.println(i);});//using lamda expression

			
		t1.start();
		t1.sleep(1000);//this makes the main thread sleep for 1000ms
		t2.start();
		t3.start();
		t4.start();
	}}



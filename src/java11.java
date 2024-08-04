class counter{
	int count;//bydefault 0
        public synchronized void increment()//synchronised makes the method used only by 1 thread at a time
	{
		count++;
	}}
public class java11
{
	public static void main(String args[])throws Exception
	{
		counter c=new counter();//creating object of above class to use its methods
		Thread t1=new Thread(new Runnable()
				{
					public void run()
					{
						for(int i=0;i<=1000;i++)//runs 1001 times
							c.increment();
					}});
		Thread t2=new Thread(new Runnable()
                                {
                                        public void run()
                                        {
                                                for(int i=0;i<=1000;i++)
                                                        c.increment();
                                        }});
		t1.start();
		t2.start();
		t1.join();//main thread waits for the completion of t1 and t1 jons main thread
		t2.join();
		System.out.println("count ="+c.count);//if the method was not synchronised,we would get value below 2002
	}
}







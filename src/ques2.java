class t1
{
	static void print1()
	{
		System.out.println("print1 t1");
	}

	static void print12()
        {
                System.out.println("print1 rewqtt1");
        }

}
public class ques2 extends t1
{
	static void print1()
	{
		System.out.println("overide");
	}

public static void main(String args[])
{
	ques2 obj = new ques2();
	ques2.print12();
	t1.print1();
	ques2.print1();
}
}


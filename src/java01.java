class java01
{
	java01()
	{
		System.out.println("constructor block");
	}
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)//change in number of parameters
	{
		return a+b+c;
	}
	float add(float a,float b)//change in datatype of parameters
	{
		return a+b;
	}
	public static void main(String args[])
	{
		java01 obj=new java01();
		int x=obj.add(2,4,5);
		float y=obj.add(2.0f,4.0f);
		System.out.println(x);
		System.out.println(y);
	}}





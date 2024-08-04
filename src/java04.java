abstract class Student
{
	abstract void info();//no braces
	void attendance()
	{
		System.out.println("Student is present ");
	}
}
interface activities
{
	void sports();
}
class Shiva extends Student implements activities
{
	@Override
	void info()
	{
		System.out.println("I'm Shiva");
	}
	@Override
       public void sports()//use public when u override an interface method
       {
	
	       System.out.println("I play Cricket");
       }
}
public class java04//use public nd filename==class name with main func 
{
	public static void main(String args[])
	{
		Shiva sh=new Shiva();
		sh.attendance();
		sh.sports();
		sh.info();
	}}
		




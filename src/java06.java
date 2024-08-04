import java.util.*;
class StackEmptyException extends Exception
{
	public StackEmptyException(String message)
	{
		super(message);
	}
}//syntax for custom exception
public class java06
{
	public static void main(String args[])
	{
		Stack <Integer> mystack=new Stack();
		mystack.push(69); //when u include that line,69 willbe pushed an no StackEmptyException..69 is printed
		try
		{
		int value=popstack(mystack);
		System.out.println("poped value is :"+value);
		}
		catch (StackEmptyException e)
		{
			System.out.println("Handled UserDef Exception-> Stack is Empty");
		}
	}
	static int popstack(Stack<Integer> mystack) throws StackEmptyException//skips the exception and forwards to main function
       	{
        if (!mystack.isEmpty()) {
            return mystack.pop();
        }
       	else {
            throw new StackEmptyException("Stack is empty");//throws an UserDef Exception
              }
	}
}



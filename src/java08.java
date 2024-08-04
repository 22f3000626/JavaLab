import java.util.*;
public class java08
{
	public static void main(String args[])
	{
	StringBuffer SBVariable = new StringBuffer("Hello");
	SBVariable.append("India");//concates with no space
	System.out.println(SBVariable);
	SBVariable.replace(1,2,"aaaa");//replaces that char set with others
	System.out.println(SBVariable);//(a,b)->where b is not included
				       //op->haaaallo
	SBVariable.insert(2,"ee");//inserts starting at 2nd place
	System.out.println(SBVariable);

	// Strings
	String str1="Java";
	String str2="Lab";
	System.out.println(str1+str2);
       
    }
}

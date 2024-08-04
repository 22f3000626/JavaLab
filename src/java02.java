 class parentclass
{
    static void printing()
    {
        System.out.println("parentclass is printing");
    }
}
public class java02 extends parentclass//child class
{
    static void printing()
    {
        System.out.println("subclass is printing");
    }

public static void main(String args[])
{
    printing();//subclass02.printing();
    parentclass.printing();
}}

import java.io.*;
class save implements Serializable
{
	int i;
}
public class java23//we have to save obj variables to obj1 
{
	public static void main(String args[])throws Exception
	{
		save obj=new save();
		obj.i=69;
		File f=new File("myobjtext.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);//writing the object into the file 
	        
		FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fis);
                save obj1=(save) ois.readObject();
		System.out.println("obj 1 i ="+obj1.i);
	}
}

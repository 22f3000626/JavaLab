import java.util.*;

public class java09 {
    public static void main(String[] args) {
        int myarray[] = {0,8,0,4,2,0,0,4};
	//u cant print myarray directly ..this prints memory address
	//u have to print using a forloop or the toString()
	System.out.println(Arrays.toString(myarray));
	Arrays.sort(myarray);//sorting
	System.out.println(Arrays.toString(myarray));
	Arrays.fill(myarray,69);//fill
	System.out.println(Arrays.toString(myarray));
	int arraycopy[] = Arrays.copyOf(myarray, myarray.length);//copyOf(arrayname,length)
	System.out.println(Arrays.toString(arraycopy));




    }
}

import java.util.*;

public class java14 {

    public static void main(String[] args) {
        LinkedList<String> mylinkedlist = new LinkedList<>();
        mylinkedlist.add("Steyn");
        mylinkedlist.add("Bumrah");
        mylinkedlist.add("Wasim");
        System.out.println("elements : " + mylinkedlist);
        mylinkedlist.add(1, "Bhuvi");
        System.out.println("new linkedlist : " + mylinkedlist);
	System.out.println("new linkedlist size is :"+ mylinkedlist.size());
	System.out.println("Does set contain Steyn : " + mylinkedlist.contains("Steyn"));
	mylinkedlist.clear();
	System.out.println("elements : " + mylinkedlist);
    }
}

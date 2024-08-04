import java.util.*;
public class java18 {
 public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Ash", 99);
        hashtable.put("Jaddu", 8);
        hashtable.put("Axar", 20);
        List<String> names = new ArrayList(hashtable.keySet());
        //sorting using comparator
        Collections.sort(names, Comparator.comparing(String::toString));//comparing string to string nd sorting
       	// Display sorted elements
        System.out.println("\nSorted List by names:");
	for(String players : names)
		System.out.println(players);

        //enumeration example
        Enumeration<String> myenumeration = Collections.enumeration(names);
        System.out.println("\nEnumeration:");
        while (myenumeration.hasMoreElements()) {
            System.out.println(myenumeration.nextElement());
        }
    }
}


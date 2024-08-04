import java.util.*;
public class java16 {
    public static void main(String[] args) {
        HashSet<String> myhashset = new HashSet<>();
        myhashset.add("Rohit");
        myhashset.add("Dhawan");
        myhashset.add("Virat");
        System.out.println("elements: " + myhashset);
        myhashset.add("Rahane");
        myhashset.add("Dhoni");
        System.out.println("modified: " + myhashset);
        myhashset.remove("Dhoni");
        System.out.println("is Dhoni in set ? : " + myhashset.contains("Dhoni"));

        System.out.println("using Iterator:");
        Iterator<String> myiterator = myhashset.iterator();
        while (myiterator.hasNext()) {
            String fruit = myiterator.next();
            System.out.println(fruit);
        }
    }
}



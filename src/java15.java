import java.util.TreeSet;//tree set is a set which automatically sorts in an ascending order
public class java15 {
    public static void main(String[] args) {
        TreeSet<String> mytreeset = new TreeSet<>();
        mytreeset.add("Markram");
        mytreeset.add("Klaasen");
        mytreeset.add("Abhishek");
        System.out.println(" elements: " + mytreeset);
        mytreeset.add("Cummins");
        System.out.println("does Dhoni exist: " +mytreeset.contains("Dhoni"));
        System.out.println("printing using enhanced for loop:");
        for (String players : mytreeset) {
            System.out.println(players);
        }
	mytreeset.clear();
	System.out.println("elements: " + mytreeset);
    }
}


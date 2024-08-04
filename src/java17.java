import java.util.*;//map is similar to dictionary in python 
public class java17 {

    public static void main(String[] args) {
        Map<String, Integer> myhashmap = new HashMap<>();//keys are a set and values are list ..keys cant be repeated
        myhashmap.put("Virat", 18);
        myhashmap.put("Rahul", 1);
        myhashmap.put("Jadeja", 8);
        System.out.println("elements: " + myhashmap);
        myhashmap.put("Rohit", 18);
        myhashmap.put("Bhuvi", 15);
	System.out.println("printing using for loop");
	for(String keys : myhashmap.keySet()){
		System.out.println(keys +" : " +myhashmap.get(keys));}
	String keycheck = "Dhoni";
        if (myhashmap.containsKey(keycheck)) {
            System.out.println(keycheck + " exists with value: " + myhashmap.get(keycheck));
        } else {
            System.out.println(keycheck + " does not exist in the HashMap.");
        }
    }
}

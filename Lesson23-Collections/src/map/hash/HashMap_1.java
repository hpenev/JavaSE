package map.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_1 {
    public static void main(String[] args) {
	// https://beginnersbook.com/2013/12/hashmap-in-java-with-example/

	/* This is how to declare HashMap */
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

	/* Adding elements to HashMap */
	hashMap.put(6, "Excellent");
	hashMap.put(5, "Very Good");
	hashMap.put(4, "Good");
	hashMap.put(3, "Satisfactory");
	hashMap.put(2, "Fail");

	System.out.println("-------------------------------------");

	/* Display content using foreach loop */

	for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
	    int key = entry.getKey();
	    String value = entry.getValue();
	    System.out.println("key is: " + key + " & Value is: " + value);
	}

	System.out.println("-------------------------------------");

	/* Display content using Iterator */
	Set set = hashMap.entrySet();
	Iterator iterator = set.iterator();
	while (iterator.hasNext()) {
	    Map.Entry mentry = (Map.Entry) iterator.next();
	    System.out.print("key is: " + mentry.getKey() + " & Value is: ");
	    System.out.println(mentry.getValue());
	}

	System.out.println("-------------------------------------");

	/* Get values based on key */
	String var = hashMap.get(2);
	System.out.println("Value at index 2 is: " + var);

	/* Remove values based on key */
	hashMap.remove(2);
	System.out.println("Map key and values after removal:");
	Set set2 = hashMap.entrySet();
	Iterator iterator2 = set2.iterator();
	while (iterator2.hasNext()) {
	    Map.Entry mentry2 = (Map.Entry) iterator2.next();
	    System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
	    System.out.println(mentry2.getValue());
	}
    }
}

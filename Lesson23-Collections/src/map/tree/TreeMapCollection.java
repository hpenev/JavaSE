package map.tree;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapCollection {
    public static void main(String[] args) {
	TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
	hm.put(103, "Ivan");
	hm.put(100, "Cvetan");
	hm.put(102, "Dragan");
	hm.put(101, "Petkan");

	for (Entry<Integer, String> m : hm.entrySet()) {
	    System.out.println(m.getKey() + " " + m.getValue());
	}

	hm.put(101, "Stoqn");

	System.out.println("~~~~~~~~~~~~~~~~~");

	for (Entry<Integer, String> entry : hm.entrySet()) {
	    System.out.println(entry.getKey() + " " + entry.getValue());
	}
    }
}

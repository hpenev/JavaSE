package set;

import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
	// https://www.tutorialspoint.com/java/java_hashset_class.htm

	HashSet<String> hs = new HashSet<>();

	hs.add("З");
	hs.add("B");
	hs.add("A");
	hs.add("D");
	hs.add("E");
	hs.add("C");

	System.out.println(hs);

	HashSet<Integer> hsInt = new HashSet<>();

	hsInt.add(7);
	hsInt.add(4);
	hsInt.add(2);
	hsInt.add(1);
	hsInt.add(15);
	hsInt.add(9);

	System.out.println(hsInt.toString());

    }
}

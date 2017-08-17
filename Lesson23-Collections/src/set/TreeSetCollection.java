package set;

import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
	// https://www.tutorialspoint.com/java/java_treeset_class.htm
	// Create a tree set
	TreeSet<String> ts = new TreeSet<>();

	// Add elements to the tree set
	ts.add("C");
	ts.add("A");
	ts.add("A");
	ts.add("A");
	ts.add("A");
	ts.add("B");
	ts.add("E");
	ts.add("F");
	ts.add("D");
	System.out.println(ts);

	TreeSet<String> newTreeSet = (TreeSet<String>) ts.subSet("B", "D");
	System.out.println(newTreeSet);

    }
}

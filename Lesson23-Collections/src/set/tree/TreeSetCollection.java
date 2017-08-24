package set.tree;

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

	TreeSet<Car> cars = new TreeSet<>();
	cars.add(new Car("Opel", "Silver"));
	cars.add(new Car("Volkswagen", "Red"));
	cars.add(new Car("Ford", "Black"));

	System.out.println("Sorted by color, by Comparable:\n" + cars);

	TreeSet<Car> cars1 = new TreeSet<>((c1, c2) -> c1.getName().compareTo(c2.getName()));
	cars1.add(new Car("Opel", "Silver"));
	cars1.add(new Car("Volkswagen", "Red"));
	cars1.add(new Car("Ford", "Black"));

	System.out.println("Sorted by name, by Comparator:\n" + cars1);

    }
}

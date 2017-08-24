package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Examples {
    public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	list.addFirst(6);
	list.addLast(1);
	list.add(4); // Appends to the end of the list
	list.add(1, 100); // Inserts at the specified position in the list
	list.set(1, 100); // Replaces the element at the specified position in
			  // this list with the specified element.

	list.isEmpty(); // Returns true if this collection contains no elements.

	System.out.println(list);

	ArrayList<Integer> arrayList = new ArrayList<>();

	Vector<Integer> vector = new Vector<>();

    }
}

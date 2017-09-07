package _recap.snippets;

import java.util.ArrayList;
import java.util.ListIterator;

public class s7 {
    public static void main(String[] args) {
	ArrayList<Integer> integers = new ArrayList();
	integers.add(1);
	integers.add(2);
	integers.add(3);
	ListIterator<Integer> iterator = integers.listIterator();

	while (iterator.hasNext()) {
	    if (iterator.next().equals(2)) {
		iterator.remove();
		integers.add(88);
	    }
	}

	System.out.println(integers.toString());
    }
}

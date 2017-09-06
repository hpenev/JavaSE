package _recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {

    static {
	System.out.println("Static block");

    }

    public static void main(String[] args) {

	// whatIsOutput();

	// iteratorRemove();

	// wrapper();

	// omgCollection();

	// kakvoShteSePrintira();

	// nesho();

    }

    public static void whatIsOutput() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter: ");
	int n = sc.nextInt();

	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= n - 1; j++) {
		System.out.print(" ");
	    }
	    for (int j = 2; j <= 2 * i; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	}
	sc.close();
    }

    public static void iteratorRemove() {
	ArrayList<String> strings = new ArrayList<>();
	strings.add("First");
	strings.add("Second");
	Iterator<String> iterator = strings.iterator();
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	    iterator.remove();
	}
	System.out.println(strings.size());
    }

    public static void omgCollection() {
	HashMap<String, ArrayList<TreeMap<Integer, LinkedList<String>>>> omg = new HashMap<>();
	omg.put("1", new ArrayList<>());
	omg.get("1").add(new TreeMap<>());
	omg.get("1").get(0).put(1, new LinkedList<>());
	omg.get("1").get(0).get(1).add("String");
	System.out.println(omg);
    }

    public static void wrapper() {
	Double a = 200000000.5;
	double b = 200000000.5;

	System.out.println(a == b);

	Integer x = 200;
	Integer y = 200;

	System.out.println(x == y);

    }

    public static void nesho() {
	Car car = new Car();

	car.print123();

	something();
	something("s");
	HashSet<Integer> sofianci = new HashSet<>();
	HashSet<Integer> narkomani = new HashSet<>();
	sofianci.removeAll(narkomani);
    }

    public static void kakvoShteSePrintira() {

	ArrayList<Integer> integeres = new ArrayList<>();
	integeres.add(1);
	integeres.add(2);
	integeres.add(3);
	ListIterator<Integer> iterator = integeres.listIterator();

	while (iterator.hasNext()) {
	    if (iterator.next().equals(2)) {
		iterator.remove();
		// iterator.add(88);
		integeres.add(88);
	    }
	}

	System.out.println(integeres.toString());
    }

    public static void something(String a) {

    }

    public static String something() {
	return null;
    }

}

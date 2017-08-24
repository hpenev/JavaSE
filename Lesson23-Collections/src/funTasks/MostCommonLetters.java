package funTasks;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostCommonLetters {
    public static void main(String[] args) {
	System.out.println("Enter a text: ");

	Scanner sc = new Scanner(System.in);
	String txt = sc.nextLine();
	sc.close();

	TreeMap<Character, Integer> mcl = new TreeMap<>();

	for (Character c : txt.toUpperCase().toCharArray()) {
	    if (c >= 'A' && c <= 'Z') {
		if (!mcl.containsKey(c)) {
		    mcl.put(c, 0);
		}
		int count = mcl.get(c);
		mcl.put(c, ++count);
	    }
	}

	TreeMap<Character, Integer> sorted = sortByValues(mcl);
	double maxCount = getMax(sorted) * 1.0;

	for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {
	    System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
	    // persantage - 20 based
	    for (int i = 0; i < entry.getValue() / maxCount * 20; i++) {
		System.out.print("#");
	    }
	    System.out.println();
	}

    }

    private static int getMax(TreeMap<Character, Integer> sorted) {
	Collection<Integer> values = sorted.values();
	int max = values.iterator().next();
	return max;
    }

    public static TreeMap<Character, Integer> sortByValues(TreeMap<Character, Integer> map) {
	Comparator<Character> valueComparator = new Comparator<Character>() {

	    @Override
	    public int compare(Character c1, Character c2) {
		int compare = map.get(c2).compareTo(map.get(c1));
		// if are the same - tell they are not the same.
		if (compare == 0) {
		    return 1;
		} else {
		    return compare;
		}
	    }
	};

	TreeMap<Character, Integer> sortedByValues = new TreeMap<Character, Integer>(valueComparator);
	sortedByValues.putAll(map);
	return sortedByValues;
    }
}

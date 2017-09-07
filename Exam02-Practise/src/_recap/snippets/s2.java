package _recap.snippets;

import java.util.ArrayList;

public class s2 {
    public static void main(String[] args) {
	ArrayList<String> strings = new ArrayList<>();
	strings.add("Now you see me");
	strings.add("... now you don't");

	for (String string : strings) {
	    if (string.equals("... now you don't")) {
		strings.remove(string);
	    }
	}

	System.out.println(strings.toString());
    }
}

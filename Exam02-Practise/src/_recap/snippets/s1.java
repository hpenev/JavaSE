package _recap.snippets;

import java.util.ArrayList;

public class s1 {
    public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(1);
	list.add(3.14);
	list.add("Bazinga");
	list.add(new ArrayList());

	System.out.println(list.size());
    }
}

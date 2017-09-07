package _recap.snippets;

import java.util.ArrayList;

public class s4 {
    public static void main(String[] args) {
	Iterator<String> iterator = new Iterator();
	ArrayList<String> strings = new ArrayList();
	strings.add("Is this the real life?");
	strings.add("is this just fantasy?");
	iterator = strings.iterator();

	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	    iterator.remove();
	}
    }
}

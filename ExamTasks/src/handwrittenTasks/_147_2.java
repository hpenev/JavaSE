package handwrittenTasks;

public class _147_2 {
    public static void main(String[] args) {
	String w1 = "хипопотам";
	String w2 = "хипопотук";

	if (w1.length() == w2.length()) {
	    System.out.println("Equal length");
	} else {
	    System.out.println("not equal length");
	}

	for (int i = 0; i < w1.length(); i++) {
	    if (w1.charAt(i) != w2.charAt(i)) {
		System.out.println((i + 1) + " " + w1.charAt(i) + "-" + w2.charAt(i));
	    }
	}
    }
}

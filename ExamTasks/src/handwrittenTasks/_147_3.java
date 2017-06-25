package handwrittenTasks;

public class _147_3 {
    public static void main(String[] args) {
	String w1 = "шапка";
	String w2 = "машина";
	int index = 0;

	for (int i = 0; i < w1.length(); i++) {
	    if (w2.indexOf(w1.charAt(i)) >= 0) {
		index = w2.indexOf(w1.charAt(i));
		break;
	    }
	}

	for (int i = 0; i < w2.length(); i++) {
	    if (i == index) {
		System.out.println(w1);
		continue;
	    }
	    System.out.println(w2.charAt(i));
	}
    }
}

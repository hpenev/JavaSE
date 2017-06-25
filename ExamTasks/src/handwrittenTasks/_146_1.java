package handwrittenTasks;

public class _146_1 {
    public static void main(String[] args) {
	String w1 = "uchilishe";
	String w2 = "uchenik";

	if (w1.length() > w2.length()) {
	    w1 = w2.substring(0, 6) + w1.substring(6);
	    System.out.println(w1 + " Length: " + w1.length());
	} else {
	    w2 = w1.substring(0, 6) + w2.substring(6);
	    System.out.println(w2 + " Length: " + w2.length());
	}
    }
}

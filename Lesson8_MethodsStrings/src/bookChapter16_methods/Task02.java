package bookChapter16_methods;

public class Task02 {
    public static void main(String[] args) {

	System.out.println(areEqual(3, 4));
    }

    static String areEqual(int a, int b) {
	if (a == b) {
	    return "Equal";
	} else {
	    return "Do not equal";
	}
    }
}

package bookChapter16_methods;

public class Task06 {
    public static void main(String[] args) {

	System.out.println(isTriangle(4, 3, 5));

    }

    static boolean isTriangle(double a, double b, double c) {
	if (a < b + c && b < a + c && c < a + b) {
	    return true;
	} else {
	    return false;
	}
    }
}

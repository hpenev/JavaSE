package season5Test1v2;

public class Task02 {
    public static void main(String[] args) {
	String text = "Write a method that takes a String variable that holds some text. The method must return the ratio between all upper case letters and all lower case letters in the text. For example if there are 75 lower case letters and 25 upper case letters, the ratio is 3:1.";
	System.out.println(ratio(text));
    }

    static String ratio(String text) {

	if (text.equals(text.toUpperCase())) {
	    return "1:0";
	}

	if (text.equals(text.toLowerCase())) {
	    return "0:1";
	}

	int upper = 0;
	int lower = 0;

	for (int i = 0; i < text.length(); i++) {

	    if (text.charAt(i) >= 65 && text.charAt(i) <= 90) {
		upper++;
	    }

	    if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
		lower++;
	    }
	}
	double result = max(upper, lower) / min(upper, lower) * 1.0;
	return String.valueOf(result) + ":1";

    }

    static int max(int a, int b) {
	return a > b ? a : b;
    }

    static int min(int a, int b) {
	return a < b ? a : b;
    }
}

package stringTasks;

public class Task04 {
    public static void main(String[] args) {
	String text = "Java can reduce costs, drive innovation, and improve application services as the programming language of choice for IoT, enterprise architecture, and cloud computing.";

	int[] letters = new int[123];
	for (int i = 0; i < text.length(); i++) {

	    char ch = text.charAt(i);
	    letters[(int) ch]++;
	}

	for (int i = 65; i <= 90; i++) {
	    System.out.print((char) i + "-" + letters[i] + " ");
	}

	System.out.println();

	for (int i = 97; i <= 122; i++) {
	    System.out.print((char) i + "-" + letters[i] + " ");
	}

    }
}

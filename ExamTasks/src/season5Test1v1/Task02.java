package season5Test1v1;

public class Task02 {
    public static void main(String[] args) {
	String text = "Write a method that takes a String variable that holds some text. The text contains words that are separated by a single space. The method must return the most frequent word from the text.";
	System.out.println("Most frequend word is: " + mostFrequentWord(text));
    }

    static String mostFrequentWord(String txt) {
	String[] words = txt.split(" ");
	String mostFrequend = "";
	int max = 0;

	for (int i = 0; i < words.length; i++) {
	    String current = words[i];
	    int count = 0;

	    for (int j = 0; j < words.length; j++) {
		if (current.equals(words[j])) {
		    count++;
		}
	    }

	    if (count > max) {
		max = count;
		mostFrequend = current;
	    }
	}

	return mostFrequend;
    }
}

package season6Test1v1;

public class Task02 {
    public static void main(String[] args) {
	String text = "Today is a good day for test. Sun is shining. The students are happy. The birds are blue.";
	longestSentence2(text);
    }

    static void longestSentence2(String text) {
	String senence = "";
	int start = 0;
	int end = 0;
	int dots = 0;

	for (int i = 0; i < text.length(); i++) {
	    if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
		start = i;
	    }
	    if (text.charAt(i) == '.') {
		dots++;
		end = i;
		if (end - start > senence.length()) {
		    senence = text.substring(start, end + 1);
		}
	    }
	}

	System.out.println(senence);
	System.out.println(dots + " sentences in the text.");

    }

    static void longestSentence1(String text) {
	String senence = "";
	int start = 0;
	int dots = 0;

	for (int i = 0; i < text.length(); i++) {
	    if (text.charAt(i) == '.') {
		dots++;
		if (text.substring(start, i + 1).length() > senence.length()) {
		    senence = text.substring(start, i + 1);
		}
		start = i + 2;
	    }
	}

	System.out.println(senence);
	System.out.println(dots + " sentences in the text.");

    }

    static void longestSentence(String text) {
	String[] sentences = text.split("\\. ");

	int longest = 0;
	int index = 0;

	for (int i = 0; i < sentences.length; i++) {
	    if (sentences[i].length() > longest) {
		longest = sentences[i].length();
		index = i;
	    }
	}

	System.out.println(sentences[index] + ".");
	System.out.println(sentences.length + " sentences in the text.");
    }
}

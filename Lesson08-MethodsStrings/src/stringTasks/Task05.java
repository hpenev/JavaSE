package stringTasks;

public class Task05 {
    public static void main(String[] args) {
	String word1 = "silent";
	String word2 = "listen";

	boolean isAnagram = true;

	if (word1.length() != word2.length()) {
	    isAnagram = false;
	} else {
	    for (int i = 0; i < word1.length(); i++) {
		if (!word2.contains(word1.substring(i, i + 1))) {
		    isAnagram = false;
		    break;
		}
	    }

	    for (int i = 0; i < word2.length(); i++) {
		if (!word1.contains(word2.substring(i, i + 1))) {
		    isAnagram = false;
		    break;
		}
	    }
	}
    }
}

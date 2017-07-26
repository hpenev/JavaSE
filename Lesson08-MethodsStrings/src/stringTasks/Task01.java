package stringTasks;

public class Task01 {
    public static void main(String[] args) {
	String prefix = "str";
	String word = "string";

	if (word.startsWith(prefix)) {
	    System.out.println(prefix + " is prefix of the word " + word);
	} else {
	    System.out.println(prefix + " isn't prefix of the word " + word);
	}
    }
}

package stringTasks;

public class Task03 {
    public static void main(String[] args) {
	String word = "neven";
	boolean isPalindrome = true;

	for (int i = 0; i < word.length() / 2; i++) {
	    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
		isPalindrome = false;
		break;
	    }
	}
	System.out.println(isPalindrome ? "Palindrome" : "not palindrome");
    }
}

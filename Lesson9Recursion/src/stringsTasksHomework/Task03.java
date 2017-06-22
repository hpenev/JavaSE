package stringsTasksHomework;

/*
3. Напишете програма, която проверява дали даден символен низ
е палиндром (един и същ е отпред назад и отзад напред).
*/

public class Task03 {
    public static void main(String[] args) {
	String word = "madam";

	boolean isPalindrome = true;

	for (int i = 0; i < word.length() / 2; i++) {
	    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
		isPalindrome = false;
		break;
	    }
	}

	System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");

    }
}

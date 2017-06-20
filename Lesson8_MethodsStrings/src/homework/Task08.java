package homework;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Check if word is palindrome");
	System.out.print("Enter a word: ");
	String word = sc.nextLine();
	sc.close();
	boolean isPalindorme = true;
	for (int i = 0; i < word.length() / 2; i++) {
	    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
		isPalindorme = false;
		break;
	    }
	}
	System.out.println(isPalindorme ? "palindrome" : "not palindrome");
    }
}

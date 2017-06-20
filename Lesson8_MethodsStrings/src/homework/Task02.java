package homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two words with length 10-20 symbols.");
	System.out.print("Two words should be separated with space: ");

	String firstWord = sc.next();
	String secondWord = sc.next();

	while (!lengthCheck(firstWord) || !lengthCheck(secondWord)) {
	    System.out.println("Strings do not meet requirements!");
	    System.out.print("Enter two words again: ");
	    firstWord = sc.next();
	    secondWord = sc.next();
	}
	sc.close();

	StringBuilder newFirstWord = new StringBuilder();
	newFirstWord.append(firstWord.length());
	newFirstWord.append(" ");
	newFirstWord.append(secondWord.substring(0, 5));
	newFirstWord.append(firstWord.substring(5));

	StringBuilder newSecondWord = new StringBuilder();
	newFirstWord.append(secondWord.length());
	newFirstWord.append(" ");
	newFirstWord.append(firstWord.substring(0, 5));
	newFirstWord.append(secondWord.substring(5));

	System.out
		.println(firstWord.length() > secondWord.length() ? newFirstWord : newSecondWord);

    }

    static boolean lengthCheck(String text) {
	if (text.length() >= 10 && text.length() <= 20) {
	    return true;
	} else {
	    return false;
	}
    }
}

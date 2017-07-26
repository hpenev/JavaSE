package stringsTasksHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
	String word = "google";

	char[] guessedChars = new char[word.length()];

	for (int i = 0; i < guessedChars.length; i++) {
	    guessedChars[i] = '_';
	}

	Scanner sc = new Scanner(System.in);

	int trys = word.length() + 3;
	boolean isGuessed = false;

	do {
	    System.out.println("trys: " + trys);
	    System.out.print("Enter a char: ");
	    char ch = sc.next().charAt(0);

	    if (word.indexOf(ch) != -1) {
		for (int i = 0; i < word.length(); i++) {
		    if (word.charAt(i) == ch) {
			guessedChars[i] = ch;
		    }
		}
	    }

	    System.out.println(Arrays.toString(guessedChars));

	    if (!String.valueOf(guessedChars).contains("_")) {
		isGuessed = true;
		break;
	    }

	    trys--;
	} while (trys != 0);

	if (isGuessed) {
	    System.out.println("Congratulations! You guessed the word \"" + word + "\"!");
	} else {
	    System.out.println("Greda!");
	    System.out.println("Word was: " + word);
	    System.out.println("Try angain!");
	}

	sc.close();
    }
}

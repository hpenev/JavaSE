package homework;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first word: ");
	String firstWord = sc.nextLine();
	System.out.print("Enter second word: ");
	String secondWord = sc.nextLine();
	sc.close();

	boolean containSameChar = false;
	for (int i = 0; i < firstWord.length(); i++) {
	    if (firstWord.charAt(i) == secondWord.charAt(0)) {
		containSameChar = true;
	    }
	}

	if (containSameChar) {
	    for (int i = 0; i < firstWord.length(); i++) {

		if (firstWord.charAt(i) == secondWord.charAt(0)) {
		    System.out.println(secondWord);
		} else {
		    System.out.println(firstWord.charAt(i));
		}

	    }
	} else {
	    System.out.println("Both strings does not contain the same char");
	}

    }

}

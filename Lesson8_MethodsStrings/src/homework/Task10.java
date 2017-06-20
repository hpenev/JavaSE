package homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String string = sc.nextLine();
	sc.close();

	StringBuilder newString = new StringBuilder();

	for (int i = 0; i < string.length(); i++) {
	    char currentChar = (char) (string.charAt(i) + 5);
	    newString.append(currentChar);
	}

	System.out.print(newString);
    }
}

package homework;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter some words: ");
	String sentance = sc.nextLine();
	String[] words = sentance.split("\\s+");

	int maxSymbols = 0;
	for (int i = 0; i < words.length; i++) {
	    if (words[i].length() > maxSymbols) {
		maxSymbols = words[i].length();
	    }
	}

	System.out.println(words.length + " words, longest word has " + maxSymbols + " symbols.");
	sc.close();
    }
}

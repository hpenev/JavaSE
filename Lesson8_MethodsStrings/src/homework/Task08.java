package homework;

/*
Задача 8:
Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
Вход: капак
Изход: да.
Вход: тенджера
Изход: не.
*/

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Check if word is palindrome");
	System.out.print("Enter a word: ");
	String word = sc.nextLine();

	while (!lengthCheck(word)) {
	    System.out.print("Enter a word: ");
	    word = sc.nextLine();
	}
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

    static boolean lengthCheck(String text) {
	if (text.length() > 0) {
	    return true;
	} else {
	    return false;
	}
    }
}

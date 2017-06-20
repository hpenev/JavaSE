package homework;
/*
Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.

Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.

*/

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

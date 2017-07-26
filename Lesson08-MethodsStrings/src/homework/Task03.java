package homework;

/*
Задача 3:
Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two words separated by space: ");

	String string1 = sc.next();
	String string2 = sc.next();

	sc.close();

	if (string1.length() == string2.length()) {
	    System.out.println("The two strings has equal length");
	} else {
	    System.out.println("The two strings has different length");
	}

	System.out.println("Difference by position:");
	for (int i = 0; i < min(string1.length(), string2.length()); i++) {
	    if (string1.charAt(i) != string2.charAt(i)) {
		System.out.printf("%d %s-%s%n", i + 1, string1.charAt(i), string2.charAt(i));
		// System.out.println((i + 1) + " " + string1.charAt(i) + "-" +
		// string2.charAt(i));
	    }
	}
    }

    static int min(int a, int b) {
	return a < b ? a : b;
    }
}

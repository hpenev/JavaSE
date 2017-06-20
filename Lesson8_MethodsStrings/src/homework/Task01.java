package homework;

/*
Задача 1:
Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter two strings, divided by space, that contain up to 40 symbols");
	System.out.println("and have at least one small and one capital letter");
	System.out.print("Enter strings: ");

	String str1 = sc.next();
	String str2 = sc.next();

	while (!hasSmallAndCapiralLetter(str1) || !lengthCheck(str1) ||
		!hasSmallAndCapiralLetter(str2) || !lengthCheck(str2)) {
	    System.out.print("Strings do not meet requirements!\nEnter strings: ");
	    str1 = sc.next();
	    str2 = sc.next();
	}
	sc.close();

	System.out.print(str1.toUpperCase());
	System.out.print(" ");
	System.out.print(str1.toLowerCase());
	System.out.print(" ");
	System.out.print(str2.toUpperCase());
	System.out.print(" ");
	System.out.print(str2.toLowerCase());
    }

    static boolean lengthCheck(String str) {
	if (str.length() <= 40) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean hasSmallAndCapiralLetter(String str) {
	// string has at least one small letter
	boolean hasSmallLetter = !str.equals(str.toUpperCase());
	// string has at least one capital letter
	boolean hasCapitalLetter = !str.equals(str.toLowerCase());

	if (hasSmallLetter && hasCapitalLetter) {
	    return true;
	} else {
	    return false;
	}
    }
}

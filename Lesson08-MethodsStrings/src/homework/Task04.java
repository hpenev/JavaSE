package homework;

/*
Задача 4:
Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
*/

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two names: ");
	// regex (zero or more whitespace)(,)(zero or more whitespace)
	String[] input = sc.nextLine().split("\\s*,\\s*");
	sc.close();

	String firstName = input[0];
	String secondName = input[0];

	int firstNameSum = 0;
	for (int i = 0; i < firstName.length(); i++) {
	    firstNameSum += firstName.charAt(i);
	}

	int secondNameSum = 0;
	for (int i = 0; i < secondName.length(); i++) {
	    secondNameSum += secondName.charAt(i);
	}

	if (firstNameSum > secondNameSum) {
	    System.out.println(firstName);
	} else {
	    System.out.println(secondName);
	}

    }
}

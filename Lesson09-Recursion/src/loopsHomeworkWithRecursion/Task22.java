package loopsHomeworkWithRecursion;

/*
Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while.

*/

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Entere a number [1..999]: ");
	int number = sc.nextInt();
	sc.close();

	if (number >= 1 && number <= 999) {

	    // iteration(number);
	    recursion(1, number);
	} else {
	    System.out.println("Wrong input");

	}
    }

    static void recursion(int i, int number) {
	if (i == 11) {
	    return;
	}

	if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
	    System.out.print(i + ":" + number + " ");
	    i++;
	}

	recursion(i, number + 1);
    }

    private static void iteration(int number) {
	int counter = 1;
	while (counter <= 10) {
	    if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
		System.out.print(counter + ":" + number + " ");
		counter++;
	    }
	    number++;
	}
    }
}

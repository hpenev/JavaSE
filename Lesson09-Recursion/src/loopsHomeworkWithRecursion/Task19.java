package loopsHomeworkWithRecursion;

/*
Задача 19: Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
*/

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number [10..99]: ");
	int num = sc.nextInt();
	sc.close();

	if (num >= 10 && num <= 99) {

	    iteration(num);

	} else {
	    System.out.println("Wrong input");
	}
    }

    private static int iteration(int num) {
	do {
	    if (num % 2 == 0) {
		num *= 0.5;
		System.out.print(num + ", ");
	    } else {
		num = num * 3 + 1;
		System.out.print(num + ", ");
	    }

	    if (num == 1) {
		break;
	    }

	} while (true);
	return num;
    }
}

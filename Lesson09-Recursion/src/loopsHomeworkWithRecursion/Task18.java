package loopsHomeworkWithRecursion;

/*
Задача 18:
Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.
Пример: 2 2
Изход:
1*1= 1;
1*2= 2;
2*1= 2;
2*2= 4;
*/

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number [1..9]: ");
	int num1 = sc.nextInt();
	System.out.print("Enter a number [1..9]: ");
	int num2 = sc.nextInt();
	sc.close();

	if (num1 > 0 && num2 > 0 && num1 < 10 && num2 < 10) {
	    // iteration(num1, num2);
	    recursion(1, num1, 1, num2);
	} else {
	    System.out.println("Wrong Input");
	}
    }

    static void recursion(int start1, int num1, int start2, int num2) {
	System.out.printf("%d * %d = %d%n", start1, start2, start1 * start2);

	if (start2 == num2 + 1) {
	    start2 = 1;
	    start1 += 1;
	}

	if (start1 == num1 && start2 == num2) {
	    return;
	}
	recursion(start1, num1, start2 + 1, num2);
    }

    static void recursion1(int start1, int num1, int start2, int num2) {
	if (start1 == num1 + 1) {
	    return;
	}

	System.out.printf("%d * %d = %d%n", start1, start2, start1 * start2);
	recursion1(start1 + 1, num1, start2, num2);
    }

    private static void iteration(int num1, int num2) {
	for (int i = 1; i <= num1; i++) {
	    if (i > num1 || i > num2) {
		break;
	    }
	    for (int j = 1; j <= num2; j++) {
		if (j > num1 || j > num2) {
		    break;
		}
		System.out.printf("%d * %d = %d\n", i, j, i * j);
	    }
	}
    }
}

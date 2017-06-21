package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*
Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
*/

public class Task14 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number [10..200]: ");
	int n = sc.nextInt();
	sc.close();

	if (n >= 10 && n <= 200) {
	    // iteration(n);
	    recursion(n);
	} else {
	    System.out.println("Wrong input");
	}
    }

    static void recursion(int n) {
	if (n == 0) {
	    return;
	}

	if (n % 7 == 0) {
	    System.out.print(n + " ");
	}

	recursion(n - 1);
    }

    private static void iteration(int n) {
	for (int i = n; i > 0; i--) {
	    if (i % 7 == 0) {
		System.out.print(i + " ");
	    }
	}
    }
}

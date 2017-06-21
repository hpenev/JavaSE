package loopsHomeworkWithRecursion;

/*
Задача 13: Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.
*/

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int sum = sc.nextInt();
	sc.close();

	if (sum > 1 && sum < 28) {
	    // iteration(sum);
	    recursion(100, 1000, sum);
	} else {
	    System.out.println("Wrong input");
	}
    }

    static void recursion(int start, int end, int sum) {
	if (start == end + 1) {
	    return;
	}

	int num = start;
	int num1 = num % 10;
	num /= 10;
	int num2 = num % 10;
	num /= 10;
	int num3 = num % 10;
	num /= 10;

	if (num1 + num2 + num3 == sum) {
	    System.out.print(start + " ");
	}
	recursion(start + 1, end, sum);
    }

    private static void iteration(int sum) {
	for (int i = 100; i < 1000; i++) {
	    int tempNum = i;
	    int num1 = tempNum % 10;
	    tempNum /= 10;
	    int num2 = tempNum % 10;
	    tempNum /= 10;
	    int num3 = tempNum % 10;
	    tempNum /= 10;

	    if (num1 + num2 + num3 == sum) {
		System.out.print(i + ", ");
	    }
	}
    }
}

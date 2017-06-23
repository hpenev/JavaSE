package homeworkRecursiveTasks;

import java.util.Scanner;

/*
Задача 2:
Да се състави програма, която изчислява произведение на две
естествени числа =>2, като се използва само събиране.
Входни данни: 2 естествени числа.
Пример: 4, 5
Изход: 20
*/

public class Task02 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number1 = sc.nextInt();
	System.out.print("Enter a number: ");
	int number2 = sc.nextInt();
	sc.close();

	System.out.println(multiplyBySum(number1, number2));
    }

    static int multiplyBySum(int a, int b) {
	if (a == 2) {
	    return b + b;
	}
	return b + multiplyBySum(a - 1, b);
    }
}

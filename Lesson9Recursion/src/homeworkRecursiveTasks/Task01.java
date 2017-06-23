package homeworkRecursiveTasks;

import java.util.Scanner;

/*
Задача 1:
Да се състави програма, която изчислява N-тото число на Фибоначи.
Първото и второто число на Фибоначи са 1-ци, всяко следващо е равно
на сбора на предходните 2.
Пример: 8
Изход: 21
Първите 5 числа на Фибоначи са : 1, 1, 2, 3, 5, 8, 13, 21
*/

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	sc.close();

	System.out.println(fibonacci(number));
    }

    static int fibonacci(int number) {

	// base case
	if (number == 1) {
	    return 1;
	}

	if (number == 2) {
	    return 1;
	}

	// recursion
	return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

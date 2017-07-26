package loopsHomeworkWithRecursion;

/*
Задача 7: Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая.

Въведете n:
5 3,6,9,12,15

*/

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a positive number: ");
	int number = sc.nextInt();
	sc.close();
	if (number > 0) {
	    // iteration(number);
	    recursion(3, number);
	} else {
	    System.out.println("Wrong input");
	}
    }

    static void recursion(int num, int count) {
	// skip last comma
	if (num % 3 == 0 && count == 1) {
	    count--;
	    System.out.print(num);
	}
	// base case
	if (count == 0) {
	    return;
	}
	// condition
	if (num % 3 == 0) {
	    count--;
	    System.out.print(num + ",");
	}
	// recursion
	recursion(num + 1, count);
    }

    private static void iteration(int number) {
	int count = 0;
	int currentNumber = 3;

	while (count < number) {
	    if (currentNumber % 3 == 0) {
		if (count + 1 == number) {
		    System.out.print(currentNumber);
		    count++;
		} else {
		    System.out.print(currentNumber + ",");
		    count++;
		}
	    }
	    currentNumber++;
	}
    }
}

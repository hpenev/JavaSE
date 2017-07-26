package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*
 * Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
    
    Въведете n:   
	1		2		3		4
	
	0		11		222		3333
			33		444		5555
					666		7777
							9999
*/

public class Task08 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	sc.close();

	if (num > 0) {
	    // iteration(num);
	    int startNumber = num - 3;
	    recursion(1, startNumber, num);

	} else {
	    System.out.println("Wring input");
	}
    }

    static void recursion(int i, int startNumber, int number) {

	if (i == number + 1) {
	    return;
	}

	printRow(startNumber + 2, number);
	recursion(i + 1, startNumber + 2, number);
    }

    static void printRow(int startNumber, int i) {
	if (i == 0) {
	    System.out.println();
	    return;
	}
	System.out.print(startNumber);
	printRow(startNumber, i - 1);
    }

    private static void iteration(int num) {
	boolean isNumEven = num % 2 == 0;
	int startNumber = num - 1;

	for (int i = 1; i <= num * 2; i++) {
	    if (isNumEven && i % 2 != 0) {
		for (int j = 1; j <= num; j++) {
		    System.out.print(startNumber);
		}
		startNumber += 2;
	    }
	    if (!isNumEven && i % 2 == 0) {
		for (int j = 1; j <= num; j++) {
		    System.out.print(startNumber);
		}
		startNumber += 2;
	    }
	    System.out.println();
	}
    }
}

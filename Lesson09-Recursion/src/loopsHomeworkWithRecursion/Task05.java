package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*
������ 5: �� �� ������� �� ����������� 2 �����. � �� ��
������� �� ������ ������ ����� �� ��-������� �� ��-��������.
*/

public class Task05 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	System.out.print("Enter different number: ");
	int b = sc.nextInt();
	sc.close();

	// iteration(a, b);
	recursion(min(a, b), max(a, b));
    }

    static int min(int a, int b) {
	return a < b ? a : b;
    }

    static int max(int a, int b) {
	return a > b ? a : b;
    }

    static void recursion(int a, int b) {
	if (a == b + 1) {
	    return;
	}

	System.out.println(a);
	recursion(a + 1, b);
    }

    private static void iteration(int a, int b) {
	int min = 0;
	int max = 0;

	if (a != b) {
	    if (a > b) {
		max = a;
		min = b;
	    } else {
		max = b;
		min = a;
	    }

	    for (int i = min; i <= max; i++) {
		System.out.print(i + " ");
	    }
	} else {
	    System.out.println("Wrong input");
	}
    }
}

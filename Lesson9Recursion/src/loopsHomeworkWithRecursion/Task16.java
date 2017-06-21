package loopsHomeworkWithRecursion;
/*
������ 16:
�� �� ������� ��������, ���� ����� �� �������� 2 ����������
����� N, M �� ��������� [10..5555].
����������, ���� ����� for, �� ������� ������ ����� ��
���������, ����� �� ������ �� 50 � �������� ���.
������: 25,249
�����: 200,150,100, 50.
*/

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number [10..5555]:");
	int n = sc.nextInt();
	System.out.print("Enter a number [10..5555]:");
	int m = sc.nextInt();
	sc.close();

	if (n >= 10 && n <= 5555 && m >= 10 && m <= 5555) {
	    // iteration(n, m);
	    recursion(max(n, m), min(n, m));
	} else {
	    System.out.println("Wrong input");
	}
    }

    static void recursion(int end, int start) {
	if (end == start + 1) {
	    return;
	}

	if (end % 50 == 0) {
	    System.out.print(end + " ");
	}

	recursion(end - 1, start);
    }

    static int max(int a, int b) {
	return a > b ? a : b;
    }

    static int min(int a, int b) {
	return a < b ? a : b;
    }

    private static void iteration(int n, int m) {
	for (int i = Math.max(n, m); i >= Math.min(n, m); i--) {
	    if (i % 50 == 0) {
		System.out.print(i + " ");
	    }
	}
    }
}
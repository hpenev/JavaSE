package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*
������ 9: �� �� �������� 2 ����� �� ������������ � � �.
�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
������������) ����� ��-������ �� 200, �� �� �������� �����������.
*/

public class Task09 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number A: ");
	int a = sc.nextInt();
	System.out.print("Enter number B: ");
	int b = sc.nextInt();
	sc.close();

	if (a != b && a < b && a > 0 && b > 0) {
	    System.out.println("\niteration");
	    iteration(a, b);

	    System.out.println("\nrecursion");
	    recursion(a, b, 0);
	} else {
	    System.out.println("Wrong input");
	}
    }

    static void recursion(int a, int b, int sum) {
	if (a == b + 1) {
	    return;
	}

	if (a % 3 == 0) {
	    System.out.print("skip " + a + ", ");
	} else {
	    sum += (a * a);
	    System.out.print(a * a + ", ");
	}

	int nextSum = sum + ((a + 1) * (a + 1));
	if (nextSum > 200) {
	    return;
	}

	recursion(a + 1, b, sum);
    }

    private static void iteration(int a, int b) {
	int sum = 0;
	for (int i = a; i <= b; i++) {

	    if (i % 3 == 0) {
		System.out.print("skip " + i + ", ");
		continue;
	    }

	    sum += (i * i);

	    // tezi shurotii sa za da mahna zapetaqta na poslednoto izvadeno
	    // chislo
	    int nextSum = sum + ((i + 1) * (i + 1));
	    if (nextSum > 200) {
		System.out.print(i * i);
		break;
	    } else {

		System.out.print(i * i + ", ");
	    }

	}
    }
}

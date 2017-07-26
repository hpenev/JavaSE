package homeworkRecursiveTasks;

import java.util.Scanner;

/*
������ 1:
�� �� ������� ��������, ����� ��������� N-���� ����� �� ��������.
������� � ������� ����� �� �������� �� 1-��, ����� �������� � �����
�� ����� �� ����������� 2.
������: 8
�����: 21
������� 5 ����� �� �������� �� : 1, 1, 2, 3, 5, 8, 13, 21
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

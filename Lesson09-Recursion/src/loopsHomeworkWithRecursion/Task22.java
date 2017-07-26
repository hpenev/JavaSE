package loopsHomeworkWithRecursion;

/*
������ 22:
�� �� ������� ��������, ����� ������� ������� 10 ���-�����
�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
�������� ���������� �����.
������� �� ��������, ������ � ������ ������� �����.
������ �����: ����� �� ��������� [1..999]
������: 1
�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
����������� ����� while.

*/

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Entere a number [1..999]: ");
	int number = sc.nextInt();
	sc.close();

	if (number >= 1 && number <= 999) {

	    // iteration(number);
	    recursion(1, number);
	} else {
	    System.out.println("Wrong input");

	}
    }

    static void recursion(int i, int number) {
	if (i == 11) {
	    return;
	}

	if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
	    System.out.print(i + ":" + number + " ");
	    i++;
	}

	recursion(i, number + 1);
    }

    private static void iteration(int number) {
	int counter = 1;
	while (counter <= 10) {
	    if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
		System.out.print(counter + ":" + number + " ");
		counter++;
	    }
	    number++;
	}
    }
}

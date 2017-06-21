package loopsHomeworkWithRecursion;

/*
������ 19: �� �� ������� ��������, ���� ����� �� ��������
���������� ����� �� ��������� [10..99] �� ������� ��������
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
����������� ���������� ������ �� �� ������ �������� 1.
������: 11
�����: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
*/

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number [10..99]: ");
	int num = sc.nextInt();
	sc.close();

	if (num >= 10 && num <= 99) {

	    iteration(num);

	} else {
	    System.out.println("Wrong input");
	}
    }

    private static int iteration(int num) {
	do {
	    if (num % 2 == 0) {
		num *= 0.5;
		System.out.print(num + ", ");
	    } else {
		num = num * 3 + 1;
		System.out.print(num + ", ");
	    }

	    if (num == 1) {
		break;
	    }

	} while (true);
	return num;
    }
}

package bookChapter16_Recursion;
/*
7. �� �� ������� ��������, ���� ����� �� �������� ������� � ������ ����� ��
�������� �� ����� ��� ��� ������ �� �����, ��������� � ������� ����� � ���-
�������� ���� �� � ���� �� ����� ���, ������ �� �� ������ �� ������� � ������
�����. ����������� ��������.

�������� ������� �����: 1
�������� ������ �����: 6
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

*/

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int min = sc.nextInt();
	System.out.print("Enter a number: ");
	int max = sc.nextInt();
	sc.close();

	row(1, min, max);
    }

    static void row(int start, int min, int max) {
	if (start == max - min + 2) {
	    return;
	}
	col(start, min);
	System.out.println();

	row(start + 1, min, max);

    }

    static void col(int index, int start) {

	if (index == 0) {
	    return;
	}

	System.out.print(start + " ");

	col(index - 1, start + 1);
    }
}

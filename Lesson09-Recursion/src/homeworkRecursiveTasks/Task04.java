package homeworkRecursiveTasks;

import java.util.Scanner;

/*
������ 4:
�� �� ������� ��������, ���� ����� �� �������� ������� � ������
����� �� �������� �� ����� ��� ��� �������� ����������������
(���������� �� �����):
������: 1, 9
�����:
1
1 2
1 2 3
... ��
1 2 3 4 5 6 7 8 9
����������� ��������
*/

public class Task04 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n1 = sc.nextInt();
	System.out.print("Enter a number: ");
	int n2 = sc.nextInt();
	sc.close();

	// row(n1, n1, n2, 1);

	for (int i = 1; i <= n2 - n1 + 1; i++) {
	    printRow(n1, n2, i);
	    System.out.println();
	}
    }

    static void printRow(int n1, int n2, int index) {
	// base case
	if (index == 0) {
	    return;
	}

	System.out.print(n1 + " ");
	printRow(n1 + 1, n2, index - 1);
    }
}

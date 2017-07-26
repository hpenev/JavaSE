package homeworkRecursiveTasks;

import java.util.Scanner;

/*
������ 5:
�� �� ������� ��������, ���� ����� �� ������� ���������� ����� N.
���������� �� ������� �����, ����� ����� �� �������� � ��� �������
�� ���������� �����.
�� �� ������� ��������� ���� ���������� ����� � ���������.
������: 12321
�����: 12321 ��.
������: 12578
�����: 87521 ��.
����������� ��������
*/

public class Task05 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
	int number = sc.nextInt();
	sc.close();

	int reverse = reverceNumber(number, 0);

	System.out.print("reversed number: " + reverse);
	if (number == reverse) {
	    System.out.println(" is pralindrome");
	} else {
	    System.out.println(" isn't pralindrome");
	}

    }

    static int reverceNumber(int number, int reverse) {
	// base case
	if (number == 0) {
	    return reverse;
	}

	reverse = reverse * 10 + number % 10;

	return reverceNumber(number / 10, reverse);
    }
}

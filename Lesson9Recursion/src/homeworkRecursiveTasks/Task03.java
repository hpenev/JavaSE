package homeworkRecursiveTasks;
/*
������ 3:
�� �� ������� ��������, ����� ��������� ���� �������� ����������
����� � ������.
������: 101
�����: ������
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	sc.close();

	System.out.println(isPrime(2, number) ? "prime" : "not prime");
    }

    static boolean isPrime(int i, int number) {
	if (i == number) {
	    return true;
	}

	if (number % i == 0) {
	    return false;
	}

	return isPrime(i + 1, number);
    }
}

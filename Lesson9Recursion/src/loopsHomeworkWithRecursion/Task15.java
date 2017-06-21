package loopsHomeworkWithRecursion;

/*
������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
������ ����� �� 1 �� �������� ����� N.
������: 5
�����: 15
*/

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a positive number: ");

	int num = sc.nextInt();
	sc.close();

	if (num > 1) {
	    // int sum = iteration(num, sum);
	    int sum = recurtion(num);

	    System.out.println("Sum is " + sum);
	} else {
	    System.out.println("Wrong input");
	}
    }

    static int recurtion(int num) {
	if (num == 1) {
	    return 1;
	}
	return num + recurtion(num - 1);
    }

    private static int iteration(int num, int sum) {
	int count = 1;
	do {
	    sum += count;
	    count++;
	} while (count <= num);

	// for (int i = 1; i <= num; i++) {
	// sum += i;
	// }

	return sum;
    }
}

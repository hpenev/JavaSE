package loopsHomeworkWithRecursion;

/*
������ 25:
�� �� ������� ��������, ����� �� ������ ����� N, �� ���������
N!, �.�. 1*2*3*4...*N.
������: 5
�����: 120
����������� ����� do-while.
*/

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	sc.close();

	if (number > 0 && number < 13) {
	    int product = 1;

	    // product = iteration(number, product);
	    product = recursion(number);

	    System.out.println(product);
	} else {
	    System.out.println("Wrong input");
	}
    }

    static int recursion(int number) {
	if (number == 1) {
	    return 1;
	}
	return number * recursion(number - 1);
    }

    private static int iteration(int number, int product) {
	int i = 1;

	do {
	    product = product * i;
	    i++;
	} while (i <= number);
	return product;
    }
}
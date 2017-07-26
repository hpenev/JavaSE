package bookIfElseStatements;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	sc.close();

	// int max = Math.max(num1, Math.max(num2, num3));

	if (num1 > num2 && num1 > num3) {
	    System.out.println(num1);
	}

	if (num2 > num1 && num2 > num3) {
	    System.out.println(num2);
	}

	if (num3 > num1 && num3 > num2) {
	    System.out.println(num3);
	}

    }
}

package bookChapter16_Recursion;

/*
1. Да се състави програма, която приема за входни данни естествено число N и
изписва на екрана стойността на N! (N факториел). Факториел на число N се из-
числява чрез умножение на всички числа от 1 до N. Използвайте рекурсия.
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a nubmer: ");
	int number = sc.nextInt();
	sc.close();

	System.out.println("factorial is : " + factorial(number));

    }

    static int factorial(int number) {
	if (number == 1) {
	    return 1;
	}

	return number * factorial(number - 1);
    }
}

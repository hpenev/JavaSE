package bookChapter8;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	System.out.print("Enter a number: ");
	int b = sc.nextInt();
	sc.close();

	sumAndPrint(a, b);
    }

    public static void sumAndPrint(int a, int b) {
	int result = a + b;
	System.out.println("Sum is " + result);
    }
}

package bookChapter3_BitwiseOperations;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		// 5. Ќапишете програма, ко€то да провер€ва колко бита от две входни
		// числа са с еднаква стойност.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = sc.nextInt();
		System.out.print("Enter a num: ");
		int b = sc.nextInt();
		sc.close();
		int result = (a ^ b);

		int binNumLength = Integer.toBinaryString(result).length();
		System.out.println(Integer.toBinaryString(result));

		int equalBits = 0;

		for (int i = 0; i < binNumLength; i++) {

			if ((result & 1) == 0) {
				equalBits++;
			}
			result = result >> 1;
		}
		System.out.println();
		System.out.printf("%d(10) %s(2)\n%d(10) %s(2)\n\nEqual bits are: %d", a, Integer.toBinaryString(a), b,
				Integer.toBinaryString(b), equalBits);
	}
}

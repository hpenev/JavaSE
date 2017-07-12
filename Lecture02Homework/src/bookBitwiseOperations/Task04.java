package bookBitwiseOperations;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		// 4. Напишете програма, която да проверява дали петият бит на дадено
		// число е нула или едно.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();

		if ((num & (1 << 5)) == 1) {
			System.out.printf("The fifth bit of the number %d(10) %s(2) is 1", num, Integer.toBinaryString(num));
		} else {
			System.out.printf("The fifth bit of the number %d(10) %s(2) is 0", num, Integer.toBinaryString(num));
		}
	}
}

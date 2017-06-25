package bookChapter3_BitwiseOperations;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		// 3. Напишете програма, която приема за входен параметър число и
		// извежда в конзолата колко бита са единица в това число.

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int originalNum = num;
		sc.close();

		int ones = 0;

		for (int i = 0; i < 32; i++) {
			ones += num & 1;
			num = num >> 1;
		}
		System.out.printf("Ones in %d(10) %s(2) are %d", originalNum, Integer.toBinaryString(originalNum), ones);
	}
}

package bookChapter16_Bitwise;

import java.util.Scanner;

/*
2. Да се състави програма, която въвежда число от 0 до 50 и го извежда в двои-
чен вид. Да НЕ се използва операцията Integer.toBinaryString().
*/

public class Task02 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");

	int number = sc.nextInt();
	sc.close();

	// solution1(number);
	solution2(number);
    }

    private static void solution2(int number) {
	long binary = 0;
	int dec = 1;

	while (number > 0) {
	    if (number % 2 == 1) {
		binary = binary + (1 * dec);
	    }
	    dec *= 10;
	    number /= 2;
	}
    }

    private static void solution1(int number) {
	for (int i = 32; i >= 0; i--) {
	    int bit = (number >> i) & 1;
	    System.out.print(bit);
	}
    }
}

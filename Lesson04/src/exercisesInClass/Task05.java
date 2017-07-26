package exercisesInClass;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	scanner.close();

	firstMethod(number);
	secondMethod(number);

    }

    private static void secondMethod(int number) {
	for (int i = 31; i >= 0; i--) {
	    int bit = (number >> i) & 1;
	    System.out.print(bit);
	}
    }

    private static void firstMethod(int number) {
	int multiplier = 1;
	int result = 0;
	while (number > 0) {
	    int reminder = number % 2;
	    result = result + reminder * multiplier;
	    multiplier *= 10;
	    number = number / 2;
	}
	System.out.println(result);
    }
}

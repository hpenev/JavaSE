package loopsExercises;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			switch (currentChar) {
			case 'a':
				sum += 1;
				break;
			case 'e':
				sum += 2;
				break;
			case 'i':
				sum += 3;
				break;
			case 'o':
				sum += 4;
				break;
			case 'u':
				sum += 5;
				break;
			default:
				sum += 0;
				break;
			}
		}

		System.out.println("sum is " + sum);

		sc.close();
	}
}

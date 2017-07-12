import java.util.Scanner;

public class isPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("Number is prime = " + isPrime);
	}
}
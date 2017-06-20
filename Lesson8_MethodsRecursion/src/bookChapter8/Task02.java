package bookChapter8;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	System.out.print("Enter a number: ");
	int b = sc.nextInt();
	sc.close();

	double avg = avarage(a, b);
	System.out.println(avg);

    }

    public static double avarage(int a, int b) {
	double result = (a + b) / 2.0;
	return result;
    }
}

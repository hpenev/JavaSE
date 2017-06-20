package bookChapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	System.out.print("Enter a number: ");
	int b = sc.nextInt();
	sc.close();

	System.out.println(Arrays.deepToString(createMatrix(a, b)));

    }

    static int[][] createMatrix(int a, int b) {
	return new int[a][b];
    }
}

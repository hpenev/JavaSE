import java.util.Arrays;
import java.util.Scanner;

public class Reading2dArray {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter rows: ");
	int rows = sc.nextInt();
	System.out.print("Enter cols: ");
	int cols = sc.nextInt();

	int[][] array = new int[rows][cols];

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[row].length; col++) {
		System.out.print("array[" + row + "][" + col + "]=");
		array[row][col] = sc.nextInt();
	    }
	}

	sc.close();

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[0].length; col++) {
		System.out.print(array[row][col] + " ");
	    }
	    System.out.println();
	}

	System.out.print(Arrays.deepToString(array));

    }
}

package bookChapter16TwoDimensionalArrays;

public class Task04 {
    public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	//
	// System.out.print("Enter how many rows do you want:");
	// int rows = sc.nextInt();
	//
	// System.out.print("Enter how many cols do you want:");
	// int cols = sc.nextInt();
	//
	// boolean[][] array = new boolean[rows][cols];
	//
	// for (int row = 0; row < array.length; row++) {
	// for (int col = 0; col < array[0].length; col++) {
	// System.out.print("Enter a number for array[" + row + "][" + col +
	// "]");
	// array[row][col] = sc.nextBoolean();
	// }
	// }
	//
	// sc.close();

	boolean[][] array = {
		{ false, false, false, true, false },
		{ false, false, false, false, false },
		{ false, false, false, false, false },
		{ false, false, false, false, false },
		{ false, false, false, false, false }
	};

	boolean hasTrue = false;

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[0].length; col++) {
		if (col + row == array.length - 2) {
		    if (array[row][col]) {
			hasTrue = true;
		    }
		}
	    }
	}
	System.out.println(hasTrue ? "In the upper antidiagonal there is a \"true\""
		: "In the upper antidiagonal there isn't a \"true\"");
    }
}

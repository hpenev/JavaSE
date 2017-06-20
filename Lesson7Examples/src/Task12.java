import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter matrix length: ");
	int length = sc.nextInt();
	System.out.print("Eneter matrix width: ");
	int width = sc.nextInt();
	sc.close();

	int[][] matrix = new int[length][width];

	int count = matrix.length * matrix[0].length;

	int col = 0;
	int row = 0;

	char direction = 'd';
	// d-down
	// l-left
	// u-up
	// r-right

	for (int i = 1; i <= count; i++) {
	    // Check if we exit the matrix and if we put a number there
	    if (direction == 'd' && (row > length - 1 || matrix[row][col] != 0)) {
		direction = 'r';
		row--;
		col++;
	    }

	    if (direction == 'r' && (col > width - 1 || matrix[row][col] != 0)) {
		direction = 'u';
		col--;
		row--;
	    }

	    if (direction == 'u' && (row < 0 || matrix[row][col] != 0)) {
		direction = 'l';
		row++;
		col--;
	    }

	    if (direction == 'l' && (col < 0 || matrix[row][col] != 0)) {
		direction = 'd';
		col++;
		row++;
	    }

	    matrix[row][col] = i;

	    // move to next cell
	    switch (direction) {
	    case 'd':
		row++;
		break;
	    case 'l':
		col--;
		break;
	    case 'u':
		row--;
		break;
	    case 'r':
		col++;
		break;
	    }
	}

	// print matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[0].length; j++) {
		System.out.printf("%3d", matrix[i][j]);
	    }
	    System.out.println();
	}
    }
}

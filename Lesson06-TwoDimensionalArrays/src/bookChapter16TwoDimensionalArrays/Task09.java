package bookChapter16TwoDimensionalArrays;

public class Task09 {
    public static void main(String[] args) {
	int[][] matrix = new int[4][5];

	int column = 0;
	int row = 0;

	for (int i = 0; i < matrix.length; i++) {
	    row = i;
	    for (int j = 0; j <= column; j++) {
		System.out.println(row + " " + j);
		row--;
	    }
	    column++;
	}
	int newRow = column;

	for (int i = 0; i < matrix.length; i++) {
	    column = newRow;
	    for (int j = i; j < matrix.length; j++) {
		System.out.println(column + " " + j);
		column--;
	    }
	}
    }
}

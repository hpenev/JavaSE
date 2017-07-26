package moreTasks;

public class Task04 {
    public static void main(String[] args) {
	int[][] array = {
		{ 11, 17, 4, 10 },
		{ 29, 4, 18, 18 },
		{ 22, 14, 5, 5 },
		{ 1, 27, 1, 11 },
		{ 25, 2, 27, 6 },
		{ 21, 24, 2, 3 }
	};

	int maxLength = array.length > array[0].length ? array.length : array[0].length;

	int[][] matrix = new int[maxLength][maxLength];

	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		matrix[i][j] = array[i][j];
	    }
	}

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}

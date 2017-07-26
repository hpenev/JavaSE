package moreTasks;

//Task02==Task04 from homework
public class Task02 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 1, 2, 3, 4 },
		{ 5, 6, 7, 8 },
		{ 9, 10, 11, 12 },
		{ 13, 14, 15, 16 }
	};

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = matrix[i].length - 1; j >= 0; j--) {
		System.out.print(matrix[j][i] + " ");
	    }
	    System.out.println();
	}
    }
}


public class Task06 {
    public static void main(String[] args) {
	char[][] matrix = {
		{ 'a', 'b', 'c', 'd' },
		{ 'd', 'e', 'f', 'g' },
		{ 'h', 'i', 'j', 'k' },
		{ 'l', 'm', 'n', 'o' }
	};

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		if (i == j) {
		    System.out.print(matrix[i][j] + " ");
		}
	    }
	}
    }
}

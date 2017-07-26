import java.util.Arrays;

public class matrixBubleSort {
    public static void main(String[] args) {

	int[][] arr = {
		{ 6, 8, 1 },
		{ 3, 7, 2 },
		{ 4, 5, 9 },
	};

	for (int i = 0; i < arr.length * arr[0].length; i++) {
	    boolean isSorted = true;
	    for (int j = 0; j < arr.length * arr[0].length - 1 - i; j++) {

		int x1 = j / arr[0].length;
		int y1 = j % arr[0].length;

		int x2 = (j + 1) / arr[0].length;
		int y2 = (j + 1) % arr[0].length;

		if (arr[x1][y1] > arr[x2][y2]) {

		    int temp = arr[x1][y1];
		    arr[x1][y1] = arr[x2][y2];
		    arr[x2][y2] = temp;

		    isSorted = false;
		}
	    }
	    if (isSorted) {
		break;
	    }
	}

	System.out.println(Arrays.deepToString(arr));
	;
    }
}

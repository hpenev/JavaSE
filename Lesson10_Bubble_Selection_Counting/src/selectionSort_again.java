import java.util.Arrays;

public class selectionSort_again {
    public static void main(String[] args) {

	// find min element
	// put min element at 1 pos
	// find min element
	// put min element at 2 pos

	// optimization
	// find max element
	// put max element at last pos
	// find max element
	// put max element at last pos -1

	// fix the bug when max is at fist Pos

	int[] array = { 7, 1, 2, 5, 3, 6 };

	for (int row = 0; row < array.length / 2; row++) {

	    // moje i bez promenlivite min i max
	    int min = array[row];
	    int minPos = row;

	    int max = array[row];
	    int maxPos = row;

	    for (int col = row; col < array.length - row; col++) {
		// find min
		if (array[col] < min) {
		    min = array[col];
		    minPos = col;
		}

		// find max
		if (array[col] > max) {
		    max = array[col];
		    maxPos = col;
		}
	    }

	    // swap min with first
	    int temp = array[row];
	    array[row] = array[minPos];
	    array[minPos] = temp;

	    // check if max position is current pos
	    // if so maxPos becomes ex minPos = t.e. row
	    if (maxPos == row) {
		maxPos = minPos;
	    }

	    // swap max with last
	    temp = array[array.length - 1 - row];
	    array[array.length - 1 - row] = array[maxPos];
	    array[maxPos] = temp;
	}

	System.out.println(Arrays.toString(array));

    }
}

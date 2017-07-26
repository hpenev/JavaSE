import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
	int[] array = { 4, 1, 8, 3, 2 };

	// bubbleSort(array); // 20 operations
	// bubbleSortOptimized(array); // 16 operations
	bubbleSortMoreOptimized(array); // 10 operations

	System.out.println(Arrays.toString(array));

    }

    private static void bubbleSortMoreOptimized(int[] array) {
	int counter = 0;
	for (int i = 0; i < array.length; i++) {
	    boolean isSorted = true;
	    // znaem 4e pri pyrvata iteraciq nai golemiq element otiva nai otzad
	    // zatova pri slevashto iterirane namalqvame s 1 element.
	    for (int j = 0; j < array.length - 1 - i; j++) {
		counter++;
		if (array[j] > array[j + 1]) {
		    int temp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = temp;
		    isSorted = false;
		}
	    }
	    if (isSorted) {
		break;
	    }
	}
	System.out.println("Operations = " + counter);

    }

    private static void bubbleSortOptimized(int[] array) {
	int counter = 0;
	for (int i = 0; i < array.length; i++) {
	    // proverqvame dali masiva e sortiran
	    boolean isSorted = true;
	    for (int j = 0; j < array.length - 1; j++) {
		counter++;
		if (array[j] > array[j + 1]) {
		    int temp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = temp;
		    isSorted = false;
		}
	    }
	    // ako e sortiran, ne produljavame
	    if (isSorted) {
		break;
	    }
	}

	System.out.println("Operations = " + counter);

    }

    private static void bubbleSort(int[] array) {
	int counter = 0;
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array.length - 1; j++) {
		counter++;
		if (array[j] > array[j + 1]) {
		    int temp = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = temp;
		}
	    }
	}
	System.out.println("Operations = " + counter);
    }
}

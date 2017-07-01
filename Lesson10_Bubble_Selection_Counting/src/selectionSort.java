import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
	int[] array = { 5, 7, 5, 9, 5, 7, 1, 2 };

	// selectionSort(array); //36 operations
	selectionSortOptimized(array); // 20 operations
	System.out.println(Arrays.toString(array));

    }

    private static void selectionSortOptimized(int[] array) {
	for (int i = 0; i < array.length / 2; i++) {

	    int maxIndex = i;
	    int minIndex = i;

	    for (int j = i; j < array.length - i; j++) {
		if (array[j] < array[i]) {
		    array[i] = array[j];
		    minIndex = j;
		}
		if (array[j] > array[i]) {
		    array[i] = array[j];
		    maxIndex = j;
		}
	    }

	    if (maxIndex == i) {
		maxIndex = minIndex;
	    }

	    int tempMin = array[i];
	    array[i] = array[minIndex];
	    array[minIndex] = tempMin;

	    int tempMax = array[array.length - 1 - i];
	    array[array.length - 1 - i] = array[maxIndex];
	    array[maxIndex] = tempMax;
	}
    }

    private static void selectionSort(int[] array) {
	int counter = 0;
	for (int i = 0; i < array.length; i++) {

	    int min = array[i];
	    int minIndex = i;

	    for (int j = i; j < array.length; j++) {

		counter++;
		if (array[j] < min) {
		    min = array[j];
		    minIndex = j;
		}
	    }

	    int temp = array[i];
	    array[i] = array[minIndex];
	    array[minIndex] = temp;
	}
	System.out.println("Operations:" + counter);
    }
}

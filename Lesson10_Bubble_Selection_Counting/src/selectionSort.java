import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
	int[] array = { 5, 7, 5, 9, 5, 7, 1, 2 };

	// selectionSort(array); //36 operations
	selectionSortOptimized(array); // 20 operations
	System.out.println(Arrays.toString(array));

    }

    private static void selectionSortOptimized(int[] array) {
	int counter = 0;
	// tysim do polovinata masiv
	for (int i = 0; i < array.length / 2; i++) {

	    int max = array[i];
	    int maxIndex = i;
	    int min = array[i];
	    int minIndex = i;

	    // tyrsim do kraq minus i
	    for (int j = i; j < array.length - i; j++) {

		counter++;
		if (array[j] < min) {
		    min = array[j];
		    minIndex = j;
		}
		if (array[j] > max) {
		    max = array[j];
		    maxIndex = j;
		}
	    }
	    // ako maximalnata stoinost e na pyrvo mqsto, zapazvame stoinostta i
	    // sled premestvaneto na minimalniq element. t.e. zapazva pyrvata
	    // poziciq na minElement
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
	System.out.println("Operations:" + counter);
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

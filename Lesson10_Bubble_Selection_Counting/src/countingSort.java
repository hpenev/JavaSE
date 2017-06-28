import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
	int[] arr = { 4, 5, 6, 1 };
	System.out.println(Arrays.toString(countingSort(arr)));

    }

    static int[] countingSort(int[] arr) {
	// 1. find min and max elements
	int min = arr[0];
	int max = arr[0];

	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] < min) {
		min = arr[i];
	    }
	    if (arr[i] > max) {
		max = arr[i];
	    }
	}
	// 2. create helper with mmax - min + 1 elements
	int[] helper = new int[max - min + 1];
	// 3. increment counters in helper
	for (int i = 0; i < arr.length; i++) {
	    int number = arr[i];
	    helper[number - min]++;
	}
	// 4. travers counter in helpers and replace each cell with new value
	// depanding on the counte
	int orignalIndex = 0;
	for (int i = 0; i < helper.length; i++) {
	    while (helper[i] > 0) {
		arr[orignalIndex++] = i + min;
		helper[i]--;
	    }
	}

	return arr;
    }
}

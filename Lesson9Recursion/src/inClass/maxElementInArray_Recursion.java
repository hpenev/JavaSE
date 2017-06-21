package inClass;

public class maxElementInArray_Recursion {
    public static void main(String[] args) {
	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };

	System.out.println("Itaration: ");
	System.out.println(findMaxIteration(array));
	System.out.println("Recursion: ");
	System.out.println(findMaxRecursion(array, 0, array[0]));
    }

    static int findMaxIteration(int[] arr) {
	int max = arr[0];
	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] > max) {
		max = arr[i];
	    }
	}
	return max;
    }

    static int findMaxRecursion(int[] arr, int i, int max) {
	// Base case
	if (i == arr.length) {
	    return max;
	}
	// logic
	if (arr[i] > max) {
	    max = arr[i];
	}

	return findMaxRecursion(arr, i + 1, max);
    }
}

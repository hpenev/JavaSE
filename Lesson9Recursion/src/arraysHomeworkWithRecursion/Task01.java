package arraysHomeworkWithRecursion;

public class Task01 {
    public static void main(String[] args) {
	// int[] arr = { 9, 6, -3, 3, -12 };
	int[] arr = { 2, 4, 6, 8 };

	System.out.println(findMinDiv3(arr, 0, arr[0]));

    }

    static int findMinDiv3(int[] arr, int i, int min) {
	if (i == arr.length) {
	    if (min % 3 == 0) {
		return min;
	    } else {
		return -1;
	    }
	}

	if (arr[i] % 3 == 0 && arr[i] < min) {
	    min = arr[i];
	}

	return findMinDiv3(arr, i + 1, min);
    }
}

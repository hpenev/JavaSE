package arraysHomeworkWithRecursion;

public class Task01 {
    public static void main(String[] args) {
	// int[] arr = { 9, 6, -3, 3, -12 };
	int[] arr = { 2, 4, 7, 8, -4 };

	System.out.println(findMinDiv3(arr, 0, arr[0]));

    }

    static int findMinDiv3(int[] arr, int i, int min) {
	if (i == arr.length - 1) {
	    if (arr[i] % 3 == 0 && arr[i] < min) {
		return arr[i];
	    } else {
		return min;
	    }
	}

	if (arr[i] % 3 == 0 && arr[i] < min) {
	    min = arr[i];
	} else {
	    min = -1;
	}

	return findMinDiv3(arr, i + 1, min);
    }
}

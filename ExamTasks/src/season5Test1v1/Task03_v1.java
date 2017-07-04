package season5Test1v1;

public class Task03_v1 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 10, 4, 5, 6 };
	System.out.println("diff=" + diff(arr, 0, arr[0], arr[0]));

    }

    static int diff(int[] arr, int i, int min, int max) {
	if (arr[i] < min) {
	    min = arr[i];
	}

	if (arr[i] > max) {
	    max = arr[i];
	}

	if (i == arr.length - 2) {
	    System.out.println("max=" + max);
	    System.out.println("min=" + min);
	    return max - min;
	}

	return diff(arr, i + 1, min, max);
    }
}

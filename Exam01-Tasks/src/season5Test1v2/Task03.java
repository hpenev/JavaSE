package season5Test1v2;

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { -1, -2, 2, 3 };
	System.out.println(findLastNegative(arr, 0, arr.length - 1));
    }

    static int findLastNegative(int[] arr, int left, int right) {

	if (arr[arr.length - 1] < 0) {
	    return arr.length;
	}

	if (arr[0] > 0) {
	    return 0;
	}

	int mid = (left + right) / 2;

	if (arr[mid] < 0 && arr[mid + 1] >= 0) {
	    return mid + 1;
	}

	if (arr[mid] < 0) {
	    return findLastNegative(arr, mid + 1, right);

	}
	if (arr[mid] > 0) {
	    return findLastNegative(arr, left, mid - 1);
	}

	return -1;
    }
}

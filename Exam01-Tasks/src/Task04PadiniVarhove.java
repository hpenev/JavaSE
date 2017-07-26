
public class Task04PadiniVarhove {
    public static void main(String[] args) {
	int[] arr = { 5, 4, 6, 7, 8 };

	int extremum = 0;
	if (arr[0] < arr[1]) {
	    extremum = maxExtremum(arr, 0, arr.length - 1);
	} else {
	    extremum = minExtremum(arr, 0, arr.length - 1);
	}
	System.out.println(extremum);

    }

    static int maxExtremum(int[] arr, int left, int right) {

	int mid = (left + right) / 2;

	if (mid == 0) {
	    mid = 1;
	}

	if (mid == arr.length - 1) {
	    return arr[mid];
	}
	// base case for max Extremum
	if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
	    return arr[mid];
	}
	// go down
	if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
	    return maxExtremum(arr, left, mid - 1);
	}
	// go up
	if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
	    return maxExtremum(arr, mid + 1, right);
	}
	return -1;
    }

    static int minExtremum(int[] arr, int left, int right) {

	int mid = (left + right) / 2;

	if (mid == 0) {
	    mid = 1;
	}

	if (mid == arr.length - 1) {
	    return arr[mid];
	}
	// base case for min Extremum
	if (arr[mid + 1] > arr[mid] && arr[mid] < arr[mid - 1]) {
	    return arr[mid];
	}
	// go down
	if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
	    return minExtremum(arr, mid + 1, right);
	}
	// go up
	if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
	    return minExtremum(arr, left, mid - 1);
	}
	return -1;
    }

}

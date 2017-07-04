
public class Task04PadiniVarhove_v1 {
    public static void main(String[] args) {
	int[] arr = { 2, 4, 3, 2, 1 };

	int extremum = 0;
	if (arr[0] < arr[1]) {
	    extremum = maxExtremum(arr, 0, arr.length - 1);
	} else {
	    extremum = minExtremum(arr, 0, arr.length - 1);
	}
	System.out.println(extremum);
    }

    static int maxExtremum(int[] arr, int left, int right) {
	if (left > right) {
	    return -1;
	}

	int mid = (left + right) / 2;

	// if extremum is last (else outOfBoundryException)
	if (mid == arr.length - 1) {
	    return arr[mid];
	}

	// if mid is 0 we say it is 1 to be sure check will be made
	// (else outOfBoundryException) when call arr[mid - 1]
	if (mid == 0) {
	    mid = 1;
	}

	// base case for max Extremum
	if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
	    return arr[mid];
	}

	// goes up
	if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
	    return maxExtremum(arr, mid + 1, right);
	}

	// goes down
	if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
	    return maxExtremum(arr, left, mid - 1);
	}

	return -1;
    }

    static int minExtremum(int[] arr, int left, int right) {
	if (left > right) {
	    return -1;
	}

	int mid = (left + right) / 2;

	// if extremum is last (else outOfBoundryException)
	if (mid == arr.length - 1) {
	    return arr[mid];
	}

	// if mid is 0 we say it is 1 to be sure check will be made
	// (else outOfBoundryException) when call arr[mid - 1]
	if (mid == 0) {
	    mid = 1;
	}

	// base case for min Extremum
	if (arr[mid - 1] > arr[mid] && arr[mid] < arr[mid + 1]) {
	    return arr[mid];
	}

	// goes up
	if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
	    return minExtremum(arr, left, mid - 1);
	}

	// goes down
	if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
	    return minExtremum(arr, mid + 1, right);
	}

	return -1;
    }
}

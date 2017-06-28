
public class binarySearch {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int find = 5;

	int index = binarySearch(arr, find, 0, arr.length - 1);

	System.out.println(index);

    }

    static int binarySearch(int[] arr, int x, int left, int right) {
	// if left greater than right - x not found
	// find mid element
	// compare with x
	// if equal return mid index
	// if greater serch between left and mid
	// if lesseer search between mid and right

	if (left > right) {
	    return -1;
	}

	int mid = (left + right) / 2;

	if (arr[mid] == x) {
	    return mid;
	} else if (x > arr[mid]) {
	    return binarySearch(arr, x, mid - 1, right);
	} else {
	    return binarySearch(arr, x, left, mid - 1); // if (x < arr[mid])
	}
    }
}

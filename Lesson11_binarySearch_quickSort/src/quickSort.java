import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
	int[] arr = { 6, 8, 1, 4, 7, 9, 3, 5 };
	quickSort(arr, 0, arr.length - 1);
	System.out.print(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int left, int right) {
	if (left >= right) {
	    return;
	}

	int pivotIndex = partition(arr, left, right);
	quickSort(arr, left, pivotIndex - 1);
	quickSort(arr, pivotIndex + 1, right);
    }

    static int partition(int[] arr, int left, int right) {
	// choose pivot
	int pivot = arr[right]; // here we can do some opitimization
	// traverse all elements except pivot
	int idx = left;
	for (int i = left; i < right; i++) {
	    // compare all with pivot
	    // if lesser move to begining
	    if (arr[i] < pivot) {
		swap(arr, i, idx++);
	    }
	}
	// last - slap pitot with element nex to the last lesser one
	swap(arr, right, idx);

	// partition(arr, left, idx + 1);
	// partition(arr, idx - 1, right);

	return idx;
    }

    static void swap(int[] arr, int i1, int i2) {
	int temp = arr[i1];
	arr[i1] = arr[i2];
	arr[i2] = temp;
    }
}

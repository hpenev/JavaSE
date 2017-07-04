
public class hasNonNegativeNums {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3 };
	System.out.println(hasNonNegativeNumbers(arr, arr.length - 1));

    }

    static boolean hasNonNegativeNumbers(int[] arr, int i) {
	if (i == 0) {
	    if (arr[i] > 0) {
		return true;
	    } else {
		return false;
	    }
	}

	if (arr[i] > 0) {
	    return hasNonNegativeNumbers(arr, i - 1);
	} else {
	    return false;
	}
    }
}

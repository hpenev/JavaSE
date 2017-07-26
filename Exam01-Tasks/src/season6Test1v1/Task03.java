package season6Test1v1;

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 0 };
	System.out.println(isAllPositive(arr, 0));

    }

    static boolean isAllPositive(int[] arr, int i) {

	if (i == arr.length - 1) {
	    if (arr[i] >= 0) {
		return true;
	    } else {
		return false;
	    }
	}

	if (arr[i] < 0) {
	    return false;
	}

	return isAllPositive(arr, i + 1);
    }
}

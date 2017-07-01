package arraysHomeworkWithRecursion;

public class Task04 {
    public static void main(String[] args) {

	int[] arr = { 3, 7, 7, 0 };
	System.out.println(isMirror(arr, 0));

    }

    static boolean isMirror(int[] arr, int i) {
	if (i == arr.length / 2) {
	    return true;
	}

	if (arr[i] != arr[arr.length - 1 - i]) {
	    return false;
	}

	return isMirror(arr, i + 1);
    }
}

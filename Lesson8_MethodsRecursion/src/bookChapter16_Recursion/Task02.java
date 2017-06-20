package bookChapter16_Recursion;

public class Task02 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, -4, 5, 6 };
	System.out.println(minValue(arr, 0, arr.length - 1));
    }

    static int minValue(int[] array, int start, int last) {
	if (start == last) {
	    return array[0];
	}

	int min = minValue(array, start + 1, last);

	if (array[start] <= min) {
	    return array[start];
	} else {
	    return min;
	}
    }
}

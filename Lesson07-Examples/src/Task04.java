import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
	int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };

	System.out.println(Arrays.toString(arr));

	for (int i = 0; i < arr.length; i++) {
	    for (int j = i; j < arr.length; j++) {
		if (arr[j] < arr[i]) {
		    int temp = arr[j];
		    arr[j] = arr[i];
		    arr[i] = temp;
		}
	    }
	}

	System.out.println(Arrays.toString(arr));

    }
}

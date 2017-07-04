
public class arraySum_recursively {
    public static void main(String[] args) {
	int[] arr = { 10, 20, 3, 4, 5, 6, 7, 8, 9 };
	int number = 4;
	int sum = sumOfArray(arr, arr.length - 1, number);
	System.out.println(sum);

    }

    public static int sumOfArray(int[] array, int i, int number) {
	if (i == 0) {
	    if (array[i] > number) {
		return array[i];
	    } else {
		return 0;
	    }
	} else {
	    if (array[i] > number) {
		return array[i] + sumOfArray(array, i - 1, number);
	    } else {
		return sumOfArray(array, i - 1, number);
	    }
	}
    }
}

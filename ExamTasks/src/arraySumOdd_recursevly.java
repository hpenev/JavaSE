public class arraySumOdd_recursevly {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int number = 4;
	int sum = sumOfArray(arr, arr.length - 1, number);
	System.out.println(sum);

    }

    static int sumOfArray(int[] arr, int i, int num) {
	if (i == 0) {
	    if (arr[i] > num && arr[i] % 2 != 0) {
		return arr[i];
	    } else {
		return 0;
	    }
	} else {
	    if (arr[i] > num && arr[i] % 2 != 0) {
		return arr[i] + sumOfArray(arr, i - 1, num);
	    } else {
		return sumOfArray(arr, i - 1, num);
	    }
	}
    }

    static int sumOfArray(int[] arr, int i, int num, int sum) {
	if (i == 0) {
	    if (arr[i] > num && arr[i] % 2 != 0) {
		return sum + arr[i];
	    } else {
		return sum;
	    }
	}

	if (arr[i] > num && arr[i] % 2 != 0) {
	    sum = sum + arr[i];
	}

	return sumOfArray(arr, i - 1, num, sum);
    }
}

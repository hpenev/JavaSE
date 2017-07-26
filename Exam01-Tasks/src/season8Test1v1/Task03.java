package season8Test1v1;

/*
Даден е масив и число Х. да се намери произведението на всички числа по големи от Х и които са нечетни. Използвайте рекурсия.
*/

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int num = 4;

	System.out.println(product(arr, 0, num, 1));
    }

    static int product(int[] arr, int i, int x, int result) {
	if (i == arr.length - 1) {
	    if (arr[i] % 2 != 0 && arr[i] > x) {
		return result * arr[i];
	    } else {
		return result;
	    }
	}

	if (arr[i] % 2 != 0 && arr[i] > x) {
	    result = result * arr[i];
	}

	return product(arr, i + 1, x, result);
    }
}

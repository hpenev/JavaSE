package bookChapter16_Recursion_v1;

/*
2. Да се състави програма, която по въведен масив с естествени числа извежда
минималния елемент от масива. Използвайте рекурсия.
*/
public class Task02 {
    public static void main(String[] args) {
	int[] arr = { 2, 3, 4, 7, 3, 3, 1, 6, 8, -9, 4, 3, 1 };

	System.out.println(findMin(arr, arr.length - 1));
    }

    static int findMin(int[] arr, int last) {
	if (last == 0) {
	    return arr[0];
	}

	int min = findMin(arr, last - 1);

	if (arr[last] < min) {
	    return arr[last];
	} else {
	    return min;
	}

    }
}

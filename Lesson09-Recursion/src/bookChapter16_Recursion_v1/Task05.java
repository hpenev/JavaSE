package bookChapter16_Recursion_v1;

/*
5. Да се състави програма, която приема за входни данни масив от цели числа.
Програмата да извежда на екрана индекса на най-големия елемент. Използвайте
рекурсия.
*/
public class Task05 {
    public static void main(String[] args) {
	int[] arr = { 9, 8, 4, 2, 3, 62, 5, 8 };

	System.out.println(findMaxElementIndex(arr, arr.length - 1));
	System.out.println(findMaxElementIndex1(arr, arr.length - 1, 0));
    }

    static int findMaxElementIndex1(int[] arr, int currentIndex, int maxCellIndex) {
	if (currentIndex == 1) {
	    if (arr[0] > arr[1]) {
		return 0;
	    } else {
		return 1;
	    }
	}

	if (arr[currentIndex] > arr[currentIndex - 1]) {
	    maxCellIndex = currentIndex;
	}

	return findMaxElementIndex(arr, currentIndex - 1);
    }

    static int findMaxElementIndex(int[] arr, int last) {
	if (last == 1) {
	    if (arr[0] > arr[1]) {
		return 0;
	    } else {
		return 1;
	    }
	}

	if (arr[last] > arr[findMaxElementIndex(arr, last - 1)]) {
	    return last;
	} else {
	    return findMaxElementIndex(arr, last - 1);
	}
    }
}

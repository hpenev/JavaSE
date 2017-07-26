package bookChapter16_Recursion_v1;

/*
3. Да се състави програма, която по въведен масив с естествени числа прове-
рява дали този масив е монотонно нарастващ. Монотонно нарастващ масив е
такъв, при който всеки следващ елемент е по-голям от предишния. Използвайте
рекурсия.
*/

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { 1, -2, 3 };
	System.out.println(isAscending(arr, arr.length - 1));
    }

    static boolean isAscending(int[] arr, int last) {
	if (last == 0) {
	    return true;
	}

	if (arr[last] > arr[last - 1]) {
	    return isAscending(arr, last - 1);
	} else {
	    return false;
	}
    }
}

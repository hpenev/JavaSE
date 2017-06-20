package bookChapter16_methods;

public class Task03 {
    public static void main(String[] args) {
	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	arrayPrint(arr);
    }

    static void arrayPrint(int[] array) {
	for (int i = 0; i < array.length; i++) {
	    if (i == array.length - 1) {
		System.out.print(array[i]);
	    } else {
		System.out.print(array[i] + ",");
	    }
	}
    }
}

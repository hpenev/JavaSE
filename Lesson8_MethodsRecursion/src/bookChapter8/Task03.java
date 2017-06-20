package bookChapter8;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
	int[] arr1 = { 1, 2, 3 };
	int[] arr2 = { 3, 4, 5, 6 };

	System.out.println(Arrays.toString(combineArrays(arr1, arr2)));

    }

    static int[] combineArrays(int[] a1, int[] a2) {

	int length = a1.length + a2.length;
	int[] newArray = new int[length];

	for (int i = 0; i < length; i++) {

	    if (i < a1.length) {
		newArray[i] = a1[i];
	    } else {
		newArray[i] = a2[i - a1.length];
	    }
	}
	return newArray;
    }
}

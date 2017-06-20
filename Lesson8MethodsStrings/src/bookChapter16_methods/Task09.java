package bookChapter16_methods;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
	int[] array1 = { 1, 4, 8, 3 };
	int[] array2 = { 3, 9, 7, 5 };

	System.out.println(Arrays.toString(minimalArray(array1, array2)));

    }

    static int[] minimalArray(int[] arr1, int[] arr2) {
	int[] result = new int[arr1.length];
	for (int i = 0; i < arr1.length; i++) {
	    if (arr1[i] < arr2[i]) {
		result[i] = arr1[i];
	    } else {
		result[i] = arr2[i];
	    }
	}
	return result;
    }
}

package bookChapter16_methods;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
	int[] a1 = { 1, 4, 8 };
	int[] a2 = { 2, 5, 7, 9 };

	System.out.println(Arrays.toString(mergeArrays(a1, a2)));

    }

    static int[] mergeArrays(int[] arr1, int[] arr2) {
	int[] result = new int[arr1.length + arr2.length];
	int i1 = 0;
	int i2 = 0;
	int index = 0;

	while (i1 < arr1.length && i2 < arr2.length) {
	    if (arr1[i1] < arr2[i2]) {
		result[index] = arr1[i1];
		i1++;
	    } else {
		result[index] = arr2[i2];
		i2++;
	    }
	    index++;
	}

	while (i1 < arr1.length) {
	    result[index] = arr1[i1];
	    i1++;
	    index++;
	}

	while (i2 < arr2.length) {
	    result[index] = arr2[i2];
	    i2++;
	    index++;
	}

	return result;
    }
}

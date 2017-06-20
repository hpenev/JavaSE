package bookChapter16_methods;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
	int[] array1 = { 1, 2, 3, 4, 5 };
	int[] array2 = { 1, 2, 3, 4, 5 };

	System.out.println(Arrays.toString(multiplyArray(array1, array2)));

    }

    static int[] multiplyArray(int[] arr1, int[] arr2) {
	int[] result = new int[arr1.length];

	for (int i = 0; i < result.length; i++) {
	    result[i] = arr1[i] * arr2[i];
	}
	return result;
    }
}

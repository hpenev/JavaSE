package inClass;

public class Tasks {
    public static void main(String[] args) {

    }

    static void printArray(int[] array) {
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
    }

    static void printArray(int[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i] + " ");
	    }
	    System.out.println();
	}
    }

    static int[] createArray(int n) {
	int[] array = new int[n];
	return array;
    }

    static int[] multiplyArrays(int[] array1, int[] array2) {

	int maxLength = array1.length > array2.length ? array1.length : array2.length;
	int minLength = array1.length < array2.length ? array1.length : array2.length;

	int[] array = new int[maxLength];

	for (int i = 0; i < minLength; i++) {
	    array[i] = array1[i] * array2[i];
	}

	return array;
    }
}

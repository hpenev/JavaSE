package inClassTasks;

/*
Write a function to multiply two arrays A and B
*/

public class Task03 {
    public static void main(String[] args) {
	int[] arr1 = { 1, 2, 3 };
	int[] arr2 = { 4, 5, 6, 7 };

	int[] newArray = multiplyArrays(arr1, arr2);

	printArray(newArray);
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

    static void printArray(int[] array) {
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
    }
}

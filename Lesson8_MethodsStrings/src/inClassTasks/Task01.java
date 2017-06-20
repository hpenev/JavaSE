package inClassTasks;

/*
Write a function to print an array
*/

public class Task01 {
    public static void main(String[] args) {
	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	printArray(array);
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
}

package inClassTasks;

import java.util.Random;

/*
Write a function to generate random array of size n
*/

public class Task02 {
    public static void main(String[] args) {
	int arraySize = 10;
	printArray(generateRandomArray(arraySize));
    }

    static int[] generateRandomArray(int size) {
	int[] array = new int[size];

	Random random = new Random();
	for (int i = 0; i < array.length; i++) {
	    array[i] = random.nextInt(100);
	}
	return array;
    }

    static void printArray(int[] array) {
	for (int i = 0; i < array.length; i++) {
	    System.out.print(array[i] + " ");
	}
    }
}

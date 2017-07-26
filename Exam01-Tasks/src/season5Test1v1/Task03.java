package season5Test1v1;

/*
3: (25%) Write a method that finds and retrieves the difference between the minimum
and the maximum element in an array of numbers. Use recursion
*/

public class Task03 {
    public static void main(String[] args) {
	int[] array = { 1, 2, 3, 4, 5, 6, 7 };
	System.out.println(
		"Difference between min and max element is: " + minMaxDifference(array, array[0], array[0], 0));

    }

    static int minMaxDifference(int[] array, int min, int max, int index) {
	if (index == array.length) {
	    return max - min;
	}

	min = array[index] < min ? array[index] : min;
	max = array[index] > max ? array[index] : max;

	return minMaxDifference(array, min, max, index + 1);
    }
}

package arraysHomework;

public class Task18 {
	public static void main(String[] args) {
		int[] array1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] array2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };

		int[] newArray = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] >= array2[i]) {
				newArray[i] = array1[i];
			}

			if (array2[i] > array1[i]) {
				newArray[i] = array2[i];
			}
		}

		System.out.print("Array1 [");
		for (int i = 0; i < array1.length; i++) {
			if (i != array1.length - 1) {
				System.out.print(array1[i] + ", ");
			} else {
				System.out.print(array1[i]);
			}
		}
		System.out.println("]");

		System.out.print("Array2 [");
		for (int i = 0; i < array2.length; i++) {
			if (i != array2.length - 1) {
				System.out.print(array2[i] + ", ");
			} else {
				System.out.print(array2[i]);
			}
		}
		System.out.println("]");

		System.out.print("Result [");
		for (int i = 0; i < newArray.length; i++) {
			if (i != newArray.length - 1) {
				System.out.print(newArray[i] + ", ");
			} else {
				System.out.print(newArray[i]);
			}
		}
		System.out.println("]");
	}
}

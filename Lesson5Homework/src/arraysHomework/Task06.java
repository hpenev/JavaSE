package arraysHomework;

public class Task06 {
	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		boolean equals = true;
		boolean sameLength = array1.length == array2.length;

		if (sameLength) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					equals = false;
					break;
				}
			}
		} else {
			equals = false;
		}

		System.out.println(equals ? "Arrays are equals" : "Arrays differs");
		System.out.println(sameLength ? "Arrays are with same length" : "Arrays length differs");
	}
}

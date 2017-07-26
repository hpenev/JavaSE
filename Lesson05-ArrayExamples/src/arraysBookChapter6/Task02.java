package arraysBookChapter6;

public class Task02 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		boolean isMirror = true;

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length / 2; i++) {

				if (array1[i] != array2[array2.length - 1 - i]) {
					isMirror = false;
					break;
				}
			}
		} else {
			isMirror = false;
		}

		System.out.println(isMirror ? "Arrays are mirror" : "They are not mirror");

	}
}

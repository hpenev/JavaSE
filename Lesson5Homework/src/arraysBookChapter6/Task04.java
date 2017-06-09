package arraysBookChapter6;

public class Task04 {
	public static void main(String[] args) {
		char[] array = { '!', '@', '¹', '$', '%', 'ˆ', '§', '*', '(', ')', '_', '+', '-', '=', 'o' };

		boolean hasLatinSmallLetter = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 97 && array[i] <= 122) {
				hasLatinSmallLetter = true;
			}
		}

		System.out.println(
				hasLatinSmallLetter ? "Array contain small latin letter" : "Array do not contain small latin letter");

	}
}

package loopsExercises;

public class Task03 {
	public static void main(String[] args) {
		for (char i = 'a'; i <= 'z'; i++) {
			if (i != 'z') {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}
	}
}

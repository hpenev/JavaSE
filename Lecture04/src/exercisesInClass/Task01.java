package exercisesInClass;

public class Task01 {
	public static void main(String[] args) {
		for (int i = -100; i <= 100; i++) {
			if (i == 100) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}

		System.out.println();

		for (int i = 100; i >= -100; i--) {
			if (i == -100) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
	}
}

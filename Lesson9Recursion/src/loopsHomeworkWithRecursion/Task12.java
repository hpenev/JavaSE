package loopsHomeworkWithRecursion;

public class Task12 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int tempNum = i;
			int num1 = tempNum % 10;
			tempNum /= 10;
			int num2 = tempNum % 10;
			tempNum /= 10;
			int num3 = tempNum % 10;
			tempNum /= 10;

			if (num1 != num2 && num2 != num3 && num1 != num3) {
				System.out.print(i + ", ");
			}
		}
	}
}
